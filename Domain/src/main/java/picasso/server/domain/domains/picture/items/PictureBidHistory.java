package picasso.server.domain.domains.picture.items;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import picasso.server.domain.domains.user.entity.User;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name="tbl_picture_bid_history")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PictureBidHistory {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @JoinColumn(name="picture_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Picture picture;

    @JoinColumn(name="user_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    private User user;

    // 경매 낙착 희망 금액
    @NotNull
    private long bidAmount;

    // 경매버튼 누른 '일자, 시간 표현을 위함'
    @NotNull
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

}
