package picasso.server.api.auction.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.items.Picture;
import picasso.server.domain.domains.items.PictureStatus;
import picasso.server.domain.domains.repository.PictureRepository;

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

    public List<Picture> findItem() {
        return pictureRepository.findAll();
    }

    public Optional<Picture> findOne(Long id) {
        return pictureRepository.findById(id);
    }


//    public List<String> extractImageUrlsSortedByDateTime() {
//
//        /*List<Picture> pictures = pictureRepository.findAllByOrderByDateTimeAsc();
//        List<String> imageUrls = new ArrayList<>();
//
//
//        for (Picture picture : pictures) {
//            String imageUrl = picture.getImgUrl();
//            Enum<PictureStatus> status = picture.getPictureStatus();
//            if(status == BIDDING){
//                imageUrls.add(imageUrl);
//            }
//        }
//        return imageUrls;*/
//
//        return pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING)
//                .stream()
//                .map(Picture::getImgUrl)
//                .toList();
//    }
//public Page<String> extractImageUrlsSortedByDateTime(int page, int pageSize) {
//    Pageable pageable = PageRequest.of(page, pageSize);
//
//    Page<Picture> picturePage = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(
//            PictureStatus.BIDDING, pageable);
//
//    // 페이지에서 이미지 URL 추출
//    List<String> imageUrls = picturePage.getContent().stream()
//            .map(Picture::getImgUrl)
//            .collect(Collectors.toList());
//
//    return new PageImpl<>(imageUrls, pageable, picturePage.getTotalElements());
//}

    public Page<String> extractImageUrlsSortedByDateTime(int page, int pageSize, PictureStatus status) {
        Pageable pageable = PageRequest.of(page, pageSize);

        Page<Picture> picturePage = pictureRepository.findAllByPictureStatusOrderByBidStartDateDesc(
                status, pageable);

        // 페이지에서 이미지 URL 추출
        List<String> imageUrls = picturePage.getContent().stream()
                .map(Picture::getImgUrl)
                .collect(Collectors.toList());

        return new PageImpl<>(imageUrls, pageable, picturePage.getTotalElements());
    }



//    public List<String> extractDetail() {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
//        List<String> detailsList = new ArrayList<>();
//        for (Picture picture : pictures) {
//            Enum<PictureStatus> status = picture.getPictureStatus();
//            if (status == BIDDING) {
//                String detail = picture.getDetails();
//                detailsList.add(detail);
//            }
//        }
//        return detailsList;
//    }

//    public List<String> extractDetail(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<String> detailsList = new ArrayList<>();
//        for (Picture picture : pictures) {
//                String detail = picture.getDetails();
//                detailsList.add(detail);
//        }
//        return detailsList;
//    }

//    public List<String> extractPictureName() {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
//        List<String> pictureNameList = new ArrayList<>();
//        for (Picture picture : pictures) {
//            Enum<PictureStatus> status = picture.getPictureStatus();
//            if (status == BIDDING) {
//                String pictureName = picture.getPictureName();
//                pictureNameList.add(pictureName);
//            }
//        }
//        return pictureNameList;
//    }
//
//    public List<String> extractPainterName() {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
//        List<String> painterNameList = new ArrayList<>();
//        for (Picture picture : pictures) {
//            Enum<PictureStatus> status = picture.getPictureStatus();
//            if (status == BIDDING) {
//                String painterName = picture.getPainterName();
//                painterNameList.add(painterName);
//            }
//        }
//        return painterNameList;
//    }
//
//    public List<Integer> extractStartPrice() {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
//        List<Integer> startPriceList = new ArrayList<>();
//        for (Picture picture : pictures) {
//            Enum<PictureStatus> status = picture.getPictureStatus();
//            if (status == BIDDING) {
//                int startPrice = picture.getStartingPrice();
//                startPriceList.add(startPrice);
//            }
//        }
//        return startPriceList;
//    }
//
//    public List<Integer> extractIncrementAmount() {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
//        List<Integer> incrementAmountList = new ArrayList<>();
//        for (Picture picture : pictures) {
//            Enum<PictureStatus> status = picture.getPictureStatus();
//            if (status == BIDDING) {
//                int incrementAmount = picture.getIncrementAmount();
//                incrementAmountList.add(incrementAmount);
//            }
//        }
//        return incrementAmountList;
//    }


    /////test

//
//    public List<String> extractPictureName(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<String> pictureNameList = new ArrayList<>();
//        for (Picture picture : pictures) {
//                String pictureName = picture.getPictureName();
//                pictureNameList.add(pictureName);
//        }
//        return pictureNameList;
//    }
//
//
//
//    public List<String> extractPainterName(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<String> painterNameList = new ArrayList<>();
//        for (Picture picture : pictures) {
//                String painterName = picture.getPainterName();
//                painterNameList.add(painterName);
//        }
//        return painterNameList;
//    }
//
//    public List<Integer> extractStartPrice(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<Integer> startPriceList = new ArrayList<>();
//        for (Picture picture : pictures) {
//                int startPrice = picture.getStartingPrice();
//                startPriceList.add(startPrice);
//        }
//        return startPriceList;
//    }
//
//    public List<Integer> extractIncrementAmount(PictureStatus status) {
//        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(status);
//        List<Integer> incrementAmountList = new ArrayList<>();
//        for (Picture picture : pictures) {
//                int incrementAmount = picture.getIncrementAmount();
//                incrementAmountList.add(incrementAmount);
//        }
//        return incrementAmountList;
//    }



////////

    public List<String> extractDetail(PictureStatus status) {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateDesc(status);
        List<String> detailsList = pictures.stream()
                .map(Picture::getDetails)
                .collect(Collectors.toList());
        return detailsList;
    }

    public List<String> extractPictureName(PictureStatus status) {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateDesc(status);
        List<String> pictureNameList = pictures.stream()
                .map(Picture::getPictureName)
                .collect(Collectors.toList());
        return pictureNameList;
    }

    public List<String> extractPainterName(PictureStatus status) {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateDesc(status);
        List<String> painterNameList = pictures.stream()
                .map(Picture::getPainterName)
                .collect(Collectors.toList());
        return painterNameList;
    }

    public List<Integer> extractStartPrice(PictureStatus status) {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateDesc(status);
        List<Integer> startPriceList = pictures.stream()
                .map(Picture::getStartingPrice)
                .collect(Collectors.toList());
        return startPriceList;
    }

    public List<Integer> extractIncrementAmount(PictureStatus status) {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateDesc(status);
        List<Integer> incrementAmountList = pictures.stream()
                .map(Picture::getIncrementAmount)
                .collect(Collectors.toList());
        return incrementAmountList;
    }







}
