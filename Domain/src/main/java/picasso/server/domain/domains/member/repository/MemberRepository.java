package picasso.server.domain.domains.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import picasso.server.domain.domains.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
//  Optional<Object> findByEmail(String email);
//
//  boolean existsByEmail(String email);
//
//  Optional<Object> findByNickname(String nickname);
//  // 필요한 추가 쿼리 메소드를 여기에 정의할 수 있습니다.
  
}

