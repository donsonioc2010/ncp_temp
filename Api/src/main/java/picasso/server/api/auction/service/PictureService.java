package picasso.server.api.auction.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.picture.items.Picture;
import picasso.server.domain.domains.picture.items.PictureInfo;
import picasso.server.domain.domains.picture.items.PictureStatus;
import picasso.server.domain.domains.picture.repository.PictureRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static picasso.server.domain.domains.picture.items.PictureStatus.BIDDING;

@Service
@Transactional
@RequiredArgsConstructor
public class PictureService {

    private final PictureRepository pictureRepository;

    //아이템등록
    public Picture saveItem(Picture picture) {
        return pictureRepository.save(picture);
    }


    public Page<PictureInfo> preparePictureInfoPage(int page, int pageSize, PictureStatus status) {
        Pageable pageable = PageRequest.of(page, pageSize);

        Page<Picture> picturePage = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status, pageable);

        List<PictureInfo> pictureInfoList = picturePage.getContent().stream()
                .map(this::mapToPictureInfo)
                .collect(Collectors.toList());

        return new PageImpl<>(pictureInfoList, pageable, picturePage.getTotalElements());
    }

    private PictureInfo mapToPictureInfo(Picture picture) {
        PictureInfo pictureInfo = new PictureInfo();
        pictureInfo.setId((picture.getPictureId()));
        pictureInfo.setImageUrl(picture.getImgUrl());
        pictureInfo.setDetails(picture.getDetails());
        pictureInfo.setPictureName(picture.getPictureName());
        pictureInfo.setPainterName(picture.getPainterName());
        pictureInfo.setStartPrice(picture.getStartingPrice());
        pictureInfo.setIncrementAmount(picture.getIncrementAmount());
        pictureInfo.setEndDay(picture.getBidEndDate());
        return pictureInfo;
    }

    public Optional<Picture> getPictureById(Long id) {
        return pictureRepository.findById(id);
    }


    public List<String> extractImageUrlsSortedByDateTime() {
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
