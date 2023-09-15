package picasso.server.api.admin.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
public class BoardResponseDTO {
    private long id;
    private long startAmount;
    private String title;
    private Timestamp created_at;
    private String status;
    private String painter;
    private String content;
    private String photo_link;
}
