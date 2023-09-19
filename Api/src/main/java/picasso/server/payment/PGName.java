package picasso.server.payment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PGName {
  KAKAO("kakaopay.TC0ONETIME"),
  TOSS("tosspay.tosstest");
  
  private final String value;
}

