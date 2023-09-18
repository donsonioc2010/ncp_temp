package picasso.server.api.admin.service;

import picasso.server.domain.domains.dto.AdminBoardDTO;

import java.util.List;


//service
public interface AdminService {
    AdminBoardDTO get(int boardNo) throws Exception;
}
