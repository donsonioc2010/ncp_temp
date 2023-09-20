package picasso.server.api.mail;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import picasso.server.common.mail.SendMailUtil;

import java.util.HashMap;

/*
 * TODO : 해당 컨트롤러 사용법 안내를 위한 TestController로 추후 삭제가 필요합니다.
 */
@Slf4j
@RequestMapping("/mail")
@RequiredArgsConstructor
@RestController
public class TestMailController {
    private final SendMailUtil sendMailUtil;

    /**
     * @param mail 메일을 파라미터로 필요 id@mailHost
     * @return
     */
    @GetMapping("/test")
    public boolean testMail(@RequestParam("mail") String mail) {
        return sendMailUtil.sendMail(
                mail,
                "테스트메일입니다.",
                MailPathConstants.SAMPLE_MAIL,
                new HashMap<>() {{
                    put("a", "A변수 데이터 입니다.");
                    put("b", "B변수 데이터 입니다.");
                }});
    }

}
