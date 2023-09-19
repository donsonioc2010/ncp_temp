package picasso.server.common.mail;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import picasso.server.common.exception.IllegalArgumentException;
import picasso.server.common.exception.MailSendException;

import java.util.Map;

import static org.apache.commons.codec.CharEncoding.UTF_8;

@Slf4j
@Component
@RequiredArgsConstructor
public class SendMailUtil {
    private final JavaMailSender javaMailSender;
    private final SpringTemplateEngine templateEngine;


    /**
     * Key는 현재 Mail에 사용중인 변수를, Value는 해당 메일 페이지에 들어갈 값을 입력하면 됩니다.
     *
     * @param toUser   발송자 메일
     * @param title    메일 제목
     * @param pagePath ThymeLeaf(HTML)파일 경로
     * @param content  ThymeLeaf에 들어갈 변수 Map (Not Null!!!)
     * @return
     */
    public boolean sendMail(String toUser, String title, String pagePath, Map<String, Object> content) {
        try {
            parameterValidate(toUser, title, content);
            MimeMessage message = javaMailSender.createMimeMessage();
            message.addRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(title, UTF_8);
            message.setText(getContent(pagePath, content), UTF_8, "html");
            javaMailSender.send(message);
            log.info("[SendMail Success] ToUser >>> {}, Title >>> {}, PagePath >>> {}", toUser, title, pagePath);
            return true;
        } catch (MessagingException e) {
            log.error("[SendMail Failed] Exception Reason >>> MessageException, ToUser >>> {}, Title >>> {}, PagePath >>> {}", toUser, title, pagePath);
            throw MailSendException.EXCEPTION;
        } catch (Exception e) {
            log.error("[SendMail Failed] Exception Reason >>> {}, ToUser >>> {}, Title >>> {}, PagePath >>> {}", e.getClass(), toUser, title, pagePath);
            throw MailSendException.EXCEPTION;
        }
    }


    //Valid, NotNull를 쓸까했는데... 안먹는걸로 기억이나서..
    private void parameterValidate(String toUser, String title, Map<String, Object> content) {
        if (toUser == null || title == null || content == null ||
                title.isEmpty() || toUser.isEmpty()) {
            throw IllegalArgumentException.EXCEPTION;
        }
    }

    // html파일에서 메일내용을 가져옴
    private String getContent(String pagePath, Map<String, Object> content) {
        Context context = new Context();
        content.forEach(context::setVariable);
        return templateEngine.process(pagePath, context);
    }

}
