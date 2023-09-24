package picasso.server.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.auction.service.PictureService;
import picasso.server.domain.domains.items.PictureStatus;


@Slf4j
@RequestMapping("/")
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PictureService pictureService;

    @GetMapping
    public String index(Model model) {
        // 관리자 승인된 경매전 게시물
        model.addAttribute("afterApprove",
                pictureService
                        .preparePictureInfoPage(0, 10, PictureStatus.AFTER_APPROVE)
                        .getContent()
        );
        // 현재 경매중인 게시물
        model.addAttribute("bidding",
                pictureService.preparePictureInfoPage(0, 10, PictureStatus.BIDDING)
                        .getContent()
        );
        return "index";
    }

}
