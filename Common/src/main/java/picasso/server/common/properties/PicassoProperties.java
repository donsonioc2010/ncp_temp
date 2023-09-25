package picasso.server.common.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ToString
@AllArgsConstructor
@ConfigurationProperties(prefix = "picasso")
public class PicassoProperties {

    private String domain;
}
