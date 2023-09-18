package picasso.server.api.admin.dto.request;


import picasso.server.api.admin.dto.response.BoardResponseDTO;

import java.util.List;

//method should be here
public interface BoardRequestDTO {
    List<BoardResponseDTO> approveMemberRequest(Long memberId);
}



