package picasso.server.domain.domains.items;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PayMethod {
  
  CARD("카드결제"),
  ;
  
  private final String method;
}
