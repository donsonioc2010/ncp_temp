package picasso.server.api.auction.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.repository.PictureRepository;

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
        return pictureRepository.save(picture);
    }

    public List<Picture> findItem() {
        return pictureRepository.findAll();
    }

    public Optional<Picture> findOne(Long id) {
        return pictureRepository.findById(id);
    }


    public List<String> extractImageUrlsSortedByDateTime() {

        /*List<Picture> pictures = pictureRepository.findAllByOrderByDateTimeAsc();
        List<String> imageUrls = new ArrayList<>();


        for (Picture picture : pictures) {
            String imageUrl = picture.getImgUrl();
            Enum<PictureStatus> status = picture.getPictureStatus();
            if(status == BIDDING){
                imageUrls.add(imageUrl);
            }
        }
        return imageUrls;*/

        return pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING)
                .stream()
                .map(Picture::getImgUrl)
                .toList();
    }


}
