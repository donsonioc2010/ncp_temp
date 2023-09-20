package picasso.server.api.exchange.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import picasso.server.api.exchange.model.request.PostCreateExchangeRequest;

@Slf4j
@RequestMapping("/exchange")
@RequiredArgsConstructor
@Controller
public class ExchangeController {
  @GetMapping("/payment")
  public String payment() {
    return "exchange";
  }
  
  @ResponseBody
  @PostMapping("/payment")
  public void sample(@RequestBody PostCreateExchangeRequest body) {
//    log.info("{} {} {} {} {} {} {}", body.getPayResult(), body.getBuyerName(), body.getBuyerEmail(), body.getMerchantUid(), body.getProductName(), body.getPgProvider(), body.getPaidAmount());
  
  }
}