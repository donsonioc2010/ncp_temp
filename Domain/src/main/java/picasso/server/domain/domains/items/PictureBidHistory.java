package picasso.server.domain.domains.items;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="t_picture_bid_history")
@NoArgsConstructor
public class PictureBidHistory {
    @Id
    private Long id;

    @JoinColumn(name="picture_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Picture picture;

    // 경매 낙착 희망 금액
    @NotNull
    private long bidAmount;

    // 경매버튼 누른 '일자, 시간 표현을 위함'
    @NotNull
    private LocalDateTime createdAt = LocalDateTime.now();

}
