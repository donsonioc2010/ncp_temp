package picasso.server.api.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class TestMessage {
    @Value("${test-message}")
    private String message;
}
