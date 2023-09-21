package picasso.server.domain.domains.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class PictureDTO {
    private Long pictureId; //그림 ID
    private String pictureName; //그림 이름
    private String painterName; //화가 이름
    private String details; //그림 설명
    private int startingPrice; //시작가격
    private int incrementAmount; //최소입찰단위
    private String size; //그림 사이즈
    private LocalDate dateTime;
    private String imgUrl; //그림 url
}






