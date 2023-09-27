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
    return "payment/payment";
  }
  
  @GetMapping("/success")
  public String paymentSuccess() {
    return "exchange/success";
  }
  
  @GetMapping("/failed")
  public String paymentFailed() {
    return "exchange/failed";
  }
  
  @ResponseBody
  @PostMapping("/payment")
  public void createPayment(@RequestBody PostCreatePaymentRequest body) {
    paymentService.savePaymentHistory(body);
    userService.updatePoint(body);
  }
}