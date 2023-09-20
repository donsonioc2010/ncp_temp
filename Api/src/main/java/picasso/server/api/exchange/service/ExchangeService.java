package picasso.server.api.exchange.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import picasso.server.api.exchange.model.dto.ExchangeDTO;
import picasso.server.api.exchange.model.request.PostCreateExchangeRequest;
import picasso.server.api.exchange.validator.ExchangeValidator;
import picasso.server.domain.domains.items.PaymentHistory;
import picasso.server.domain.domains.repository.ExchangeRepository;

@Service
@RequiredArgsConstructor
public class ExchangeService {
  
  private final ExchangeRepository exchangeRepository;
  private final ExchangeValidator exchangeValidator;
  
  
}
