package picasso.server.api.admin.service;

import picasso.server.api.admin.dto.response.BoardResponseDTO;

@Service
public class DefaultAdminService implements AdminService {

    @Autowired
    private RequestManager requestManager;

    @Override
    public BoardResponseDTO getRequest(long id, String content) {
        Request request = requestManager.getRequest(id, content);

        if (request != null) {
            BoardResponseDTO boardResponseDTO = new BoardResponseDTO();
            boardResponseDTO.setId(request.getRequestId());
            return boardResponseDTO;
        }

        return null;
    }

    @Override
    public boolean approveRequest(long id) {
        return requestManager.approveRequest(id);
    }

    @Override
    public boolean rejectRequest(long id) {
        return requestManager.rejectRequest(id);
    }
}
