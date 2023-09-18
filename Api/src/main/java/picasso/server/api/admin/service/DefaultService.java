package picasso.server.api.admin.service;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//DefaultService

@Service
public class DefaultService implements AdminService {

    @Autowired
    public AdminService adminService;

    public List<BoardResponseDTO> getAllRequests() {
        return adminService.findAll();
    }

    public void approveRequest(Long requestId) {
        return
    }

    public void approveAllRequests(List<Long> requestIds) {
    }

    public void rejectRequest(Long requestId) {
    }

    public BoardResponseDTO getRequestById(Long requestId) {
    }

    public void processAutoRejection() {
    }

    @Override
    public List<BoardResponseDTO> findAllByApprovedFalseAndRequestTimeBefore(DateTime thresholdTime) {
        return null;
    }
}