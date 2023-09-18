package picasso.server.api.admin.dto.response;

import lombok.*;

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



    public class RequestManager {

    private List<Request> requests;
        public RequestManager() {
            this.requests = new ArrayList<>();
        }

        public Request getRequest(long id, String content) {
            Request request = getRequestByIdAndContent(id, content);

            if (request != null) {
                return request;
            }

            return null;
        }

        public boolean approveRequest(long id) {
            for (Request request : requests) {
                if (request.getRequestApprove() == 1) {
                    request.setRequestApproved(true);
                    return true;
                }
            }
            return false;
        }

        public boolean rejectRequest(long id) {
            for (Request request : requests) {
                if (request.getRequestId() == id) {
                    requests.remove(request);
                    return true;
                }
            }
            return false;
        }

        private Request getRequestByIdAndContent(long id, String content) {
            return new Request(id, content);
        }
    }

}
