package picasso.server.domain.domains.picture.items;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PictureInfo {
    private Long id;
    private String imageUrl;
    private String details;
    private String pictureName;
    private String painterName;
    private Integer startPrice;
    private Integer incrementAmount;
    private LocalDate endDay;
    private String startDate;
    private String endDate;
}
