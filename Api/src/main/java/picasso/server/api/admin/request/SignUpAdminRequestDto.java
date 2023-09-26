package picasso.server.api.admin.request;

import lombok.*;

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