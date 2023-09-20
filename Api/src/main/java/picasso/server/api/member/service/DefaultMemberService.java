//package picasso.server.api.member.service;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import picasso.server.domain.domains.member.entity.Member;
//import picasso.server.domain.domains.member.repository.MemberRepository;
//
//import java.util.List;
//
//@Service
//public class DefaultMemberService implements MemberService {
//  {
//    System.out.println("DefaultMemberService 생성됨!");
//  }
//
//  MemberRepository memberRepository;
//
//  public DefaultMemberService(MemberRepository memberRepository) {
//
//  }
//
//  @Transactional
//  @Override
//  public int add(Member member) throws Exception {
//    return memberDao.insert(member);
//  }
//
//  @Override
//  public List<Member> list() throws Exception {
//    return memberDao.findAll();
//  }
//
//  @Override
//  public Member get(int memberNo) throws Exception {
//    return memberDao.findBy(memberNo);
//  }
//
//  @Override
//  public Member get(String email, String password) throws Exception {
//    return memberDao.findByEmailAndPassword(email, password);
//  }
//
//  @Transactional
//  @Override
//  public int update(Member member) throws Exception {
//    return memberDao.update(member);
//  }
//
//  @Transactional
//  @Override
//  public int delete(int memberNo) throws Exception {
//    return memberDao.delete(memberNo);
//  }
//}
