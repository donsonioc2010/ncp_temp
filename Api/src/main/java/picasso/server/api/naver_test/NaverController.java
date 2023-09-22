package picasso.server.api.naver_test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import picasso.server.common.properties.NaverObjectStorageProperties;
import picasso.server.common.util.NaverObjectStorageUsageType;
import picasso.server.common.util.NaverObjectStorageUtil;

import java.util.ArrayList;
import java.util.List;
/*
TODO : 기능개발 완료이후 삭제해야 할 파일
 */

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/naver")
public class NaverController {
    private final NaverObjectStorageProperties naverObjectStorageProperties;
    private final NaverObjectStorageUtil naverObjectStorageUtil;

    @GetMapping("/properties-test")
    @ResponseBody
    public ResponseEntity<String> naverTest() {
        return ResponseEntity.ok(
                naverObjectStorageProperties.getEndPoint() + " " +
                        naverObjectStorageProperties.getRegionName()
        );
    }

    @GetMapping("/file-upload-test-form")
    public String uploadTest() {
        return "test/upload-form";
    }

    @PostMapping("/file-upload-test")
    @ResponseBody
    public ResponseEntity fileUploadTest(
            @RequestPart(value = "profile", required = false) MultipartFile profile,
            @RequestPart(value = "paint", required = false) MultipartFile paint
    ) {
        List<String> filePath = new ArrayList<>();
        if (!profile.isEmpty())
            filePath.add(
                    naverObjectStorageUtil.storageFileUpload(
                            NaverObjectStorageUsageType.PROFILE, profile
                    )
            );
        if (!paint.isEmpty())
            filePath.add(
                    naverObjectStorageUtil.storageFileUpload(
                            NaverObjectStorageUsageType.PAINT, paint
                    )
            );
        if (filePath.isEmpty())
            filePath.add("업로드한 파일이 없음");

        return ResponseEntity.ok(filePath);
    }

}
