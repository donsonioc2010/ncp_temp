package picasso.server.domain.domains.member.type;

import lombok.AllArgsConstructor;
import lombok.Builder;

public class TestSample {

  @Builder
  static class EnumSample {
    private LoginType sample;
  }

  public static void main(String[] args) {
    EnumSample.builder()
            .sample(LoginType.NAVER)
            .build();
  }
}

