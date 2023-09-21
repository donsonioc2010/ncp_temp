//package picasso.server.api.member.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import picasso.server.domain.domains.member.entity.Member;
//import picasso.server.domain.domains.member.repository.MemberRepository;
//
//import java.util.List;
//
//@Service
//public class DefaultMemberService implements MemberService {
//
//  private final MemberRepository memberRepository;
//
//  @Autowired
//  public DefaultMemberService(MemberRepository memberRepository) {
//    this.memberRepository = memberRepository;
//  }
//
//  @Override
//  public List<Member> findAllMembers() {
//    return memberRepository.findAll();
//  }
//
//  @Override
//  public Member getLoggedInMember() {
//    // 로그인한 사용자의 정보를 가져오는 로직
//    return null; // 임시 반환 값. 실제 로직에 따라 수정 필요.
//  }
//}
