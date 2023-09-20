//package picasso.server.api.member.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import picasso.server.domain.domains.member.repository.MemberRepository;
////import picasso.server.api.member.service.TokenService;
//
//@Service
//public class AuthServiceImpl {
//
//  private final MemberRepository memberRepository;
////  private final PasswordEncoder passwordEncoder;
////  private final TokenService tokenService;
//
//  @Autowired
//  public AuthServiceImpl(MemberRepository memberRepository) {
//    this.memberRepository = memberRepository;
////    this.passwordEncoder = passwordEncoder;
////    this.tokenService = tokenService;
//  }
//
////  @Override
////  public void register(Member member) {
////    if (memberRepository.existsByEmail(member.getEmail())) {
////      throw new IllegalArgumentException("Email already in use.");
////    }
////    member.setPassword(passwordEncoder.encode(member.getPassword())); // 비밀번호 암호화
////    memberRepository.save(member);
////  }
////
////  @Override
////  public String login(String email, String password) {
////    Member member = memberRepository.findByEmail(email)
////            .orElseThrow(() -> new IllegalArgume
////                    ntException("Invalid email or password."));
////
////    if (!passwordEncoder.matches(password, member.getPassword())) {
////      throw new IllegalArgumentException("Invalid email or password.");
////    }
////
////    return tokenService.generateAccessToken(member); // 토큰 생성 로직
////  }
////
////  @Override
////  public String refreshToken(String refreshToken) {
////    return tokenService.refreshAccessToken(refreshToken); // 토큰 새로고침 로직
////  }
//}
