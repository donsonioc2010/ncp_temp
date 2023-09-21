package picasso.server.domain.domains.user.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyPageDTO {

  private String nickname;
  private Long point;
  private String profile;



}
