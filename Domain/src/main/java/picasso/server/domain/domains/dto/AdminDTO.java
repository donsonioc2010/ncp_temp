package picasso.server.domain.domains.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@ToString
@Getter
@Setter
public class AdminDTO {
    private int boardNo;
    private Timestamp createdDate;
    private String changeToApproveStatue;



    }

