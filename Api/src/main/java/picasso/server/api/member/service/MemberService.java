//package picasso.server.api.member.service;
//
//import picasso.server.domain.domains.member.entity.Member;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface MemberService {
//
//  // 회원 생성
//  Member save(Member member);
//
//  // 회원 조회 (ID 기반)
//  Optional<Member> findById(Long id);
//
//  // 모든 회원 조회
//  List<Member> findAll();
//
//  // 회원 수정
//  Member update(Member member);
//
//  // 회원 삭제 (ID 기반)
//  void deleteById(Long id);
//
//  // 회원 이메일로 조회
//  Optional<Member> findByEmail(String email);
//
//  // 회원 닉네임으로 조회
//  Optional<Member> findByNickname(String nickname);
//
//  // 회원 상태 변경
//  void updateStatus(Long id, String status);
//
//  // 회원 포인트 추가
//  void addPoints(Long id, Long points);
//}
