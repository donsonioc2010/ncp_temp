package picasso.server.common.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import picasso.server.common.properties.NaverObjectStorageProperties;

@Configuration
@EnableConfigurationProperties(
    {
        NaverObjectStorageProperties.class
    }
)
public class ConfigurationPropertiesConfig {
}
