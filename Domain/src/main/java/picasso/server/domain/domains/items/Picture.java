package picasso.server.domain.domains.items;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tbl_picture")
@NoArgsConstructor
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pictureId;

    @NotNull
    private String imgUrl; //그림 url

    @NotNull
    private String pictureName; //그림 이름

    @NotNull
    private String painterName; //화가 이름

    @Lob
    private String details; //그림 설명


    //기본 값을 BEFORE_APPROVE로 사용
    @NotNull
    @Enumerated(EnumType.STRING)
    private PictureStatus pictureStatus = PictureStatus.BEFORE_APPROVE;

    //시작 가격, 기본 최소 가격 0원
    private int startingPrice = 0;

    //최소 입찰 단위, 기본 최소값 500 원
    private int incrementAmount = 500;

    private String size; //그림 사이즈

    @NotNull // 경매 시작일, 기본 값은 Now(); 를 사용한다.
    private LocalDate bidStartDate = LocalDate.now();

    @NotNull
    private LocalDate bidEndDate; // 경매 종료일

    //경매 내역 History
    @OneToMany(mappedBy = "picture", fetch = FetchType.LAZY)
    private List<PictureBidHistory> bidHistory = new ArrayList<>();

}
