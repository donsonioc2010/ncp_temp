package picasso.server.domain.domains.admin.vo.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ListAdminRequestDto {

    private Long pictureId;
    private String imageUrl;
    private String pictureName;
    private String painterName;
    private String details;
    private int startingPrice;
    private Integer incrementAmount;
    private String size;
    private LocalDate bidStartDate;
}
