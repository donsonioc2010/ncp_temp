package picasso.server.api.auction.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.auction.service.PictureBidHistoryService;
import picasso.server.common.exception.NotLoginUserRestException;
import picasso.server.domain.domains.picture.items.PictureStatus;
import picasso.server.domain.domains.user.entity.User;

@Slf4j
@Controller
@RequestMapping("/bid-history")
@RequiredArgsConstructor
public class PictureBidHistoryController {
  
  private final PictureBidHistoryService pictureBidHistoryService;
  
  @GetMapping("/myBidList")
  public String retrieveBidHistoryList(Model model, HttpSession session) {
    User user = (User) session.getAttribute("loginUser");
    if (user == null) {
      throw NotLoginUserRestException.EXCEPTION;
    }
    model.addAttribute("bidList", pictureBidHistoryService.retrieveMyBidHistoryList(user));
    return "bidhistory/mybid";
  }
  
  @GetMapping("/myPictureList")
  public String retrieveMyPictureHistoryList(Model model, HttpSession session) {
    User user = (User) session.getAttribute("loginUser");
    if (user == null) {
      throw NotLoginUserRestException.EXCEPTION;
    }
    model.addAttribute("pictureList", pictureBidHistoryService.retrieveMyPictureList(user, PictureStatus.BIDDING));
    return "bidhistory/myPictureList";
  }
}
