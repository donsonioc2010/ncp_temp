package picasso.server.api.admin.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@ToString
public class AttachedFile implements Serializable {
    private static final long serialVersionUID = 1L;

    int no;
    String originName;
    String filePath;
    int boardNo;
}
