package picasso.server.domain.domains.items;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PictureInfo {
    private String imageUrl;
    private String details;
    private String pictureName;
    private String painterName;
    private Integer startPrice;
    private Integer incrementAmount;
    private LocalDate endDay;
}
