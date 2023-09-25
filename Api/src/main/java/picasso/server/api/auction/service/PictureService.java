package picasso.server.api.auction.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureInfo;
import picasso.server.domain.domains.items.PictureStatus;
import picasso.server.domain.domains.repository.PictureRepository;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PictureService {

    private final PictureRepository pictureRepository;
    private final Map<String, Picture> imageInfoMap = new HashMap<>();

//    public Picture getPictureInfo(String imageUrl) {
//        return imageInfoMap.get(imageUrl);
//    }


    //아이템등록
    public Picture saveItem(Picture picture) {
        return pictureRepository.save(picture);
    }

//    public List<Picture> findItem() {
//        return pictureRepository.findAll();
//    }
//
//    public Optional<Picture> findOne(Long id) {
//        return pictureRepository.findById(id);
//    }


//    public Page<String> extractImageUrlsSortedByDateTime(int page, int pageSize, PictureStatus status) {
//        Pageable pageable = PageRequest.of(page, pageSize);
//
//        Page<Picture> picturePage = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(
//                status, pageable);
//
//        // 페이지에서 이미지 URL 추출
//        List<String> imageUrls = picturePage.getContent().stream()
//                .map(Picture::getImgUrl)
//                .collect(Collectors.toList());
//
//
//        return new PageImpl<>(imageUrls, pageable, picturePage.getTotalElements());
//    }


//    public List<String> extractDetail(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<String> detailsList = pictures.stream()
//                .map(Picture::getDetails)
//                .collect(Collectors.toList());
//        return detailsList;
//    }

//    public List<String> extractPictureName(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<String> pictureNameList = pictures.stream()
//                .map(Picture::getPictureName)
//                .collect(Collectors.toList());
//        return pictureNameList;
//    }

//    public List<String> extractPainterName(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<String> painterNameList = pictures.stream()
//                .map(Picture::getPainterName)
//                .collect(Collectors.toList());
//        return painterNameList;
//    }

//    public List<Integer> extractStartPrice(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<Integer> startPriceList = pictures.stream()
//                .map(Picture::getStartingPrice)
//                .collect(Collectors.toList());
//        return startPriceList;
//    }

//    public List<Integer> extractIncrementAmount(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<Integer> incrementAmountList = pictures.stream()
//                .map(Picture::getIncrementAmount)
//                .collect(Collectors.toList());
//        return incrementAmountList;
//    }


//    public List<LocalDate> extractEndDay(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<LocalDate> endDayList = pictures.stream()
//                .map(Picture::getBidEndDate)
//                .collect(Collectors.toList());
//        return endDayList;
//    }


//    public Map<String, String> createUrlToPictureNameMap(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<String> urlList = pictures.stream()
//                .map(Picture::getImgUrl)
//                .collect(Collectors.toList());
//
//        List<String> pictureNameList = pictures.stream()
//                .map(Picture::getPictureName)
//                .collect(Collectors.toList());
//
//        // 각 URL을 키로 하고, 해당 URL에 대응하는 pictureName을 값으로 설정
//        Map<String, String> urlToPictureNameMap = new HashMap<>();
//        for (int i = 0; i < urlList.size(); i++) {
//                urlToPictureNameMap.put(urlList.get(i), pictureNameList.get(i));
//        }
//
//        return urlToPictureNameMap;
//    }



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
