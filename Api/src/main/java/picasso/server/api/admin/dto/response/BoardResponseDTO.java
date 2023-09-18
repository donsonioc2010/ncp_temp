package picasso.server.api.admin.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.time.LocalDate;

//vo
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor

@Entity
public class BoardResponseDTO {

@Id @GeneratedValue
    private long id;
    private long startAmount;
    private String title;
    private Timestamp created_at;
    private DateTime requestTime;
    private DateTime approvalTime;

    @Column(name = "status")
    private String status;
    private String painter;
    private String content;


    private static int request;


    public BoardResponseDTO() {

    }
}

