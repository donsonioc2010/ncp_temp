package picasso.server.api.exchange.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import picasso.server.api.exchange.model.request.PostCreatePaymentRequest;
import picasso.server.api.exchange.service.PaymentService;
import picasso.server.api.user.service.UserService;
import picasso.server.domain.domains.user.entity.User;

import java.util.Optional;

@Slf4j
@RequestMapping("/exchange")
@RequiredArgsConstructor
@Controller
public class PaymentController {
  
  private final PaymentService paymentService;
  private final UserService userService;
  
  @GetMapping("/payment")
  public String paymentForm() {
    return "exchange";
  }
  
  @ResponseBody
  @PostMapping("/payment")
  public void createPayment(@RequestBody PostCreatePaymentRequest body) {
    log.info("{} {} {} {} {} {}", body.getPayResult(), body.getUserId(), body.getMerchantUid(), body.getProductName(), body.getPgProvider(), body.getPaidAmount());
    paymentService.savePaymentHistory(body);
    Optional<User> user = userService.findUserById(body.getUserId());
    user.ifPresent(u -> u.updatePoint(body.getPaidAmount()));
  }
}