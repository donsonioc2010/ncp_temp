package picasso.server.api.user.vo.request;

import lombok.*;

import java.time.LocalDate;

import static java.time.LocalDate.now;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpAdminRequestDto {
    private String nickName;
    private String email;
    private String password;
}