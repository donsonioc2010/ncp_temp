package picasso.server.api.admin.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BoardResponseDTO {
    private long id;
    private long startAmount;
    private String title;
}
