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

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

}
