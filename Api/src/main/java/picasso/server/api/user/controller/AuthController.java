package picasso.server.api.user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.NotFound;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import picasso.server.api.user.service.UserService;
import picasso.server.api.user.vo.request.LoginRequestDto;
import picasso.server.api.user.vo.request.SignUpRequestDto;
import picasso.server.common.exception.NotFoundException;
import picasso.server.common.exception.UserNotFoundException;
import picasso.server.domain.domains.user.entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    /**
     * 로그인 폼으로 이동
     *
     * @return
     */
    @GetMapping("/login")
    public String showLoginForm(HttpSession session) {
        // TODO :  페이지 들어올때 자동로그인 설정 된 경우 Cookie 받아서 처리하는 로직 추가하기
        return "auth/login";
    }

    /**
     * 로그인 기능 구현
     *
     * @param requestDto
     * @param session
     * @return
     * @throws JsonProcessingException
     */
    @PostMapping("/login")
    public String handleLogin(LoginRequestDto requestDto, HttpSession session) throws JsonProcessingException {
        session.removeAttribute("loginUser");
        Optional<User> findResult = userService.login(requestDto);
        findResult.ifPresent(user -> setSessionLoginUser(session, user));
        if (findResult.isEmpty())
            return "redirect:/auth/login";
        return "redirect:/";
    }


    /**
     * 회원가입 폼으로 이동
     *
     * @return
     */
    @GetMapping("/signup")
    public String showSignUpForm() {
        return "auth/signup-form";
    }

    /**
     * 회원가입 처리 로직
     *
     * @param requestDto
     * @return
     */
    @PostMapping("/signup")
    public String signUp(SignUpRequestDto requestDto, HttpSession session) {
        setSessionLoginUser(session, userService.signUp(requestDto));
        return "redirect:/";
    }
    private void setSessionLoginUser(HttpSession session, User user) {
        session.setAttribute("loginUser", user);
    }
    
    @ResponseBody
    @PostMapping("/session-info")
    public Map<String, Long> paymentSessionInfoRtn(HttpSession session) {
        User temp = (User)session.getAttribute("loginUser");
        Long userId = userService.findUserById(temp.getId()).orElseThrow(
                () -> UserNotFoundException.EXCEPTION
        ).getId();
        return new HashMap<String, Long>(){{
            put("userId", userId);
        }};
    }
}
