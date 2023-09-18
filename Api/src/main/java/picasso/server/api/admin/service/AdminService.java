package picasso.server.api.admin.service;

import org.joda.time.DateTime;
import picasso.server.api.admin.dto.response.BoardResponseDTO;

import java.util.List;


//service
public interface AdminService {
    int add(Board board) throws Exception;
    List<Board> list(int category) throws Exception;
    Board get(int boardNo) throws Exception;
    int delete(int boardNo) throws Exception;
    AttachedFile getAttachedFile(int fileNo) throws Exception;
    int changeToApproveStatue(int request) throws Exception;
}
