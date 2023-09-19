package picasso.server.api.auction.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;
import picasso.server.domain.domains.repository.PictureRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static picasso.server.domain.domains.items.PictureStatus.BIDDING;

@Service
@Transactional
@RequiredArgsConstructor
public class PictureService {

    private final PictureRepository pictureRepository;

    //아이템등록
    public Picture saveItem(Picture picture) {
        Picture savedPicture = pictureRepository.save(picture);
        return savedPicture;
    }

    public List<Picture> findItem() {
        return pictureRepository.findAll();
    }

    public Optional<Picture> findOne(Long id) {
        return pictureRepository.findById(id);
    }

//    public List<Picture> findEnum(PictureStatus status) {
//        return pictureRepository.findByPictureStatus();
//    }

//    public List<String> extractImageUrlsSortedByDateTime() {
//        List<Picture> pictures = pictureRepository.findAllByOrderByDateTimeAsc();
//        List<String> imageUrls = new ArrayList<>();
//
//
//        for (Picture picture : pictures) {
//            String imageUrl = picture.getImgUrl();
//            imageUrls.add(imageUrl);
//        }
//
//        return imageUrls;
//    }

    public List<String> extractImageUrlsSortedByDateTime() {
        List<Picture> pictures = pictureRepository.findAllByOrderByDateTimeAsc();
        List<String> imageUrls = new ArrayList<>();


        for (Picture picture : pictures) {
            String imageUrl = picture.getImgUrl();
            Enum<PictureStatus> status = picture.getPictureStatus();
            if(status == BIDDING){
                imageUrls.add(imageUrl);
            }
        }

        return imageUrls;
    }




}
