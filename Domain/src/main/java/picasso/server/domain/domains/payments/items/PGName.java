package picasso.server.domain.domains.payments.items;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PGName {
  KAKAO("kakaopay"),
  TOSS("tosspay");
  
  private final String value;
}

