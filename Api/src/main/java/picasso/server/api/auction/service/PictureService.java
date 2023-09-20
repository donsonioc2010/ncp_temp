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

    public List<String> extractDetail() {

        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
        List<String> detailsList = new ArrayList<>();
        for (Picture picture : pictures) {
            Enum<PictureStatus> status = picture.getPictureStatus();
            if (status == BIDDING) {
                String detail = picture.getDetails();
                detailsList.add(detail);
            }
        }
        return detailsList;
    }

    public List<String> extractPictureName() {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
        List<String> pictureNameList = new ArrayList<>();
        for (Picture picture : pictures) {
            Enum<PictureStatus> status = picture.getPictureStatus();
            if (status == BIDDING) {
                String pictureName = picture.getPictureName();
                pictureNameList.add(pictureName);
            }
        }
        return pictureNameList;
    }

    public List<String> extractPainterName() {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
        List<String> painterNameList = new ArrayList<>();
        for (Picture picture : pictures) {
            Enum<PictureStatus> status = picture.getPictureStatus();
            if (status == BIDDING) {
                String painterName = picture.getPainterName();
                painterNameList.add(painterName);
            }
        }
        return painterNameList;
    }

    public List<Integer> extractStartPrice() {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
        List<Integer> startPriceList = new ArrayList<>();
        for (Picture picture : pictures) {
            Enum<PictureStatus> status = picture.getPictureStatus();
            if (status == BIDDING) {
                int startPrice = picture.getStartingPrice();
                startPriceList.add(startPrice);
            }
        }
        return startPriceList;
    }

    public List<Integer> extractIncrementAmount() {
        List<Picture> pictures = pictureRepository.findAllByPictureStatusOrderByBidStartDateAsc(BIDDING);
        List<Integer> incrementAmountList = new ArrayList<>();
        for (Picture picture : pictures) {
            Enum<PictureStatus> status = picture.getPictureStatus();
            if (status == BIDDING) {
                int incrementAmount = picture.getIncrementAmount();
                incrementAmountList.add(incrementAmount);
            }
        }
        return incrementAmountList;
    }












}
