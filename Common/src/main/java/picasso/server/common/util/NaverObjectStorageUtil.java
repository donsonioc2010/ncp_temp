package picasso.server.common.util;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import picasso.server.common.exception.FileDeleteException;
import picasso.server.common.exception.FileIOException;
import picasso.server.common.exception.FileUploadException;
import picasso.server.common.properties.NaverObjectStorageProperties;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;


@Slf4j
@RequiredArgsConstructor
@Component
public class NaverObjectStorageUtil {
    private final AmazonS3 storageObject;
    private final NaverObjectStorageProperties naverObjectStorageProperties;
    private final Environment environment;

    /**
     * 사용처, MultipartFile만 제공하면 업로드가 가능하다.
     *
     * @param usageType
     * @param file
     * @return
     * @throws FileUploadException
     */
    public String storageFileUpload(NaverObjectStorageUsageType usageType, MultipartFile file){
        try {
            String filePath = getPath(usageType, getFileUUIDNameByMultipartFile(file));

            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentType(file.getContentType());
            metadata.setContentLength(file.getBytes().length);

            uploadFile(
                    usageType, filePath, file.getInputStream(), metadata
            );
            log.info("File Upload : {}", filePath);
            return filePath;
        } catch (IOException e) {
            throw FileIOException.EXCEPTION;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw FileUploadException.EXCEPTION;
        }
    }

    /**
     * 파일 삭제를 진행할 경우 사용한다
     *
     * @param filePath
     * @throws FileDeleteException
     */
    public void storageFileDelete(String filePath) throws FileDeleteException {
        try {
            storageObject.deleteObject(
                    naverObjectStorageProperties.getBucketName(),
                    filePath
            );
            log.info("File Delete : {}", filePath);
        } catch (Exception e) {
            throw FileDeleteException.EXCEPTION;
        }
    }


    /**
     * 실제 File을 NaverObject Storage에 Upload
     *
     * @param usageType
     * @param filePath
     * @param uploadTarget
     * @param metadata
     */
    private void uploadFile(NaverObjectStorageUsageType usageType, String filePath, InputStream uploadTarget, ObjectMetadata metadata) {
        storageObject.putObject(
                new PutObjectRequest(
                        naverObjectStorageProperties.getBucketName(),
                        filePath,
                        uploadTarget,
                        metadata
                ).withCannedAcl(CannedAccessControlList.PublicRead)
        );
    }

    /**
     * UUID.png 등으로 제작하기 위함
     *
     * @param file
     * @return
     */
    private String getFileUUIDNameByMultipartFile(MultipartFile file) {
        return UUID.randomUUID() +
                "." +
                FilenameUtils.getExtension(file.getOriginalFilename());
    }

    /**
     * ObjectStorage에 저장될 File Path
     *
     * @param usageType
     * @param fileName
     * @return
     */
    private String getPath(NaverObjectStorageUsageType usageType, String fileName) {
        return environment.getProperty("spring.profiles.active", "default") + "/"
                + usageType.getPath() + "/"
                + fileName;
    }


}
