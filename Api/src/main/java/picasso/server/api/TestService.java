package picasso.server.api;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import picasso.server.domain.domains.test.Test;
import picasso.server.domain.domains.test.TestRepository;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;


    public Optional<Test> test() {
        return testRepository.findById(1L);
    }
}
