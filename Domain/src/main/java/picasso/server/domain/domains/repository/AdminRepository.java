package picasso.server.domain.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.admin.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
