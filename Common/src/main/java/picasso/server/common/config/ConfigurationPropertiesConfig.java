package picasso.server.common.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import picasso.server.common.properties.NaverObjectStorageProperties;
import picasso.server.common.properties.PicassoProperties;

@Configuration
@EnableConfigurationProperties(
    {
        NaverObjectStorageProperties.class,
        PicassoProperties.class
    }
)
public class ConfigurationPropertiesConfig {
}
