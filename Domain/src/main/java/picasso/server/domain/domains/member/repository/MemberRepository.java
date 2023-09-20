package picasso.server.domain.domains.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

