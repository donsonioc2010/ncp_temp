package picasso.server.domain.domains.items;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Picture {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long picture_id;

    private String imgUrl; //그림 url

    private String pictureName; //그림 이름

    private String painterName; //화가 이름

    @Column(nullable = false)
    private String details; //그림 설명

    private int startingPrice; //시작 가격

    private int incrementAmount; //최소 입찰 단위

    private String size; //그림 사이즈
    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    private PictureStatus status; //그림 상태

}
