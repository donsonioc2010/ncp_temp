package picasso.server.api.auction.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;
import picasso.server.domain.domains.repository.PictureRepository;

import java.time.LocalDate;
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

    /**
     * 찾아야 하는 상태값과 시작일자를 받아, 상태값을 updateStatus로 변경한다.
     *
     * @param searchStatus 찾아야 하는 상태값
     * @param updateStatus 변경하고자 하는 상태값
     * @param bidStartDate   찾아야 하는 경매 종료 일자
     * @return Picture List를 반환한다.
     */
    public List<Picture> changePictureStatusByPictureStatusAndBidStartDate(PictureStatus searchStatus, PictureStatus updateStatus, LocalDate bidStartDate) {
        List<Picture> result = pictureRepository
                .findAllByPictureStatusAndBidStartDate(searchStatus, bidStartDate);

        result.forEach(picture -> picture.setPictureStatus(updateStatus));
        return result;
    }

    /**
     * 찾아야 하는 상태값과 종료일자를 받아, 상태값을 updateStatus로 변경한다.
     *
     * @param searchStatus 찾아야 하는 상태값
     * @param updateStatus 변경하고자 하는 상태값
     * @param bidEndDate   찾아야 하는 경매 종료 일자
     * @return Picture List를 반환한다.
     */
    public List<Picture> changePictureStatusByPictureStatusAndBidEndDate(PictureStatus searchStatus, PictureStatus updateStatus, LocalDate bidEndDate) {
        List<Picture> result = pictureRepository
                .findAllByPictureStatusAndBidEndDate(searchStatus, bidEndDate);

        result.forEach(picture -> picture.setPictureStatus(updateStatus));
        return result;
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<Picture> findPictureStatusByStatusAndBidEndDate(PictureStatus searchStatus, LocalDate bidEndDate) {
        return pictureRepository
                .findAllByPictureStatusAndBidEndDate(searchStatus, bidEndDate);
    }

    public List<Picture> saveAllPictureList(List<Picture> saveList) {
        return pictureRepository.saveAll(saveList);
    }

}
