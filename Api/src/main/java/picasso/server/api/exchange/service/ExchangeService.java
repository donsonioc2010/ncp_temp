package picasso.server.api.exchange.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.exchange.model.dto.ExchangeDTO;
import picasso.server.api.exchange.model.request.PostCreateExchangeRequest;
import picasso.server.api.exchange.validator.ExchangeValidator;
import picasso.server.domain.domains.items.Exchange;
import picasso.server.domain.domains.repository.ExchangeRepository;

@Service
@RequiredArgsConstructor
public class ExchangeService {
  
  private final ExchangeRepository exchangeRepository;
  private final ExchangeValidator exchangeValidator;
  
  public void execute(PostCreateExchangeRequest body) {
    // TODO: body에 대한 Validator 구현 후 Valid 과정 거칠 예정
    ExchangeDTO exchangeDTO = body.getExchangeDTO();
    createExchange(exchangeDTO);
  }
  
  @Transactional
  public void createExchange(ExchangeDTO exchangeDTO) {
    Exchange exchange = Exchange.builder()
            .pgName(exchangeDTO.getPgName())
            .payMethod(exchangeDTO.getPayMethod())
            .merchantUUID(exchangeDTO.getMerchantUUID())
            .productName(exchangeDTO.getProductName())
            .price(exchangeDTO.getPrice())
            .build();
    
    exchangeRepository.save(exchange);
  }
}
