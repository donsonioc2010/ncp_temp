package picasso.server.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// EnableJpaRepositories Reference : https://stackoverflow.com/questions/46732402/spring-boot-autowiring-of-beans-is-not-working-in-maven-multi-module-project
@Slf4j
@EntityScan("picasso.server.domain")
@ComponentScan(basePackages = {"picasso.server"})
@EnableJpaRepositories(basePackages = {"picasso.server.domain"})
@SpringBootApplication
@RequiredArgsConstructor
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
