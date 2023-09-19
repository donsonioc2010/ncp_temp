package picasso.server.api.exchange.controller;

import com.siot.IamportRestClient.IamportClient;
import com.siot.IamportRestClient.exception.IamportResponseException;
import com.siot.IamportRestClient.response.IamportResponse;
import com.siot.IamportRestClient.response.Payment;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import picasso.server.api.exchange.model.request.PostCreateExchangeRequest;
import picasso.server.api.exchange.service.ExchangeService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
 * TODO : 해당 컨트롤러 사용법 안내를 위한 TestController로 추후 삭제가 필요합니다.
 */

@Slf4j
@RequestMapping("/exchange")
@RequiredArgsConstructor
@RestController
public class ExchangeController {
  
  private final ExchangeService exchangeService;
  private IamportClient api = new IamportClient("REST API KEY", "REST SECRET KEY");
  private String impKey = System.getProperty("IMP");
  
  
  @GetMapping("/{pictureId}")
  public void testExchange(@PathVariable Long pictureId, @RequestBody @Valid PostCreateExchangeRequest body) {
    // TODO: User Entity 구현 후 User 정보 넣어 execute
//    UserUtils.getCurrentUser(UserUtils.getUserId());
    exchangeService.execute(body);
  }
  
  @PostMapping(value="/imp_validate/{imp_uid}")
  public IamportResponse<Payment> paymentByImpUid(@PathVariable String imp_uid) throws IamportResponseException, IOException {
    return api.paymentByImpUid(imp_uid);
  }
  
}