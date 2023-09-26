package picasso.server.api.user.vo.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MyPageRequestDto {
  private String orgNickName;
  private String chgNickName;
  private String isNewProfile;
  private MultipartFile profile;
}
