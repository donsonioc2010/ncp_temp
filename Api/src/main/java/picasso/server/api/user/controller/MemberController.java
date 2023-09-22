//package picasso.server.api.member.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//import picasso.server.api.member.service.MemberService;
//import picasso.server.domain.domains.member.entity.Member;
//
//@Controller
//@RequestMapping("/member")
//public class MemberController {
//
//  @Autowired
//  MemberService memberService;
//
//  @GetMapping("form")
//  public void form() {
//  }
//
//  @PostMapping("add")
//  public String add(Member member, MultipartFile photofile) throws Exception {
//    System.out.println(member);
//    if (photofile.getSize() > 0) {
//      String uploadFileUrl = ncpObjectStorageService.uploadFile(
//              "bitcamp-nc7-bucket-20", "member/", photofile);
//      member.setPhoto(uploadFileUrl);
//    }
//    memberService.add(member);
//    return "redirect:list";
//  }
//
//
//
//
//  @GetMapping("/login")
//  public String loginPage(Model model) {
//    // 로그인 페이지로 이동하는 컨트롤러 메서드
//    // Model 객체를 사용하여 필요한 데이터를 뷰로 전달할 수 있습니다.
//    return "login"; // 로그인 페이지의 뷰 이름
//  }
//
//  // 회원 등록 페이지로 이동하는 컨트롤러 메서드
//  @GetMapping("/register")
//  public String registerPage(Model model) {
//    // 회원 등록 페이지로 이동
//    return "register"; // 회원 등록 페이지의 뷰 이름
//  }
//
//  // 회원 등록 처리를 위한 컨트롤러 메서드
//  @PostMapping("/register")
//  public String registerMember(@ModelAttribute Member member, Model model) {
//    try {
//      // 회원 등록 서비스 호출
//      memberService.register(member);
//      // 등록 성공 시 홈 페이지로 이동
//      return "redirect:/home";
//    } catch (IllegalArgumentException e) {
//      // 등록 실패 시 에러 메시지를 모델에 추가하여 다시 회원 등록 페이지로 이동
//      model.addAttribute("error", e.getMessage());
//      return "register"; // 회원 등록 페이지의 뷰 이름
//    }
//  }
//
//  // 회원 정보 수정 페이지로 이동하는 컨트롤러 메서드
//  @GetMapping("/edit/{id}")
//  public String editMemberPage(@PathVariable Long id, Model model) {
//    // 회원 정보 수정 페이지로 이동
//    Member member = memberService.findById(id);
//    model.addAttribute("member", member);
//    return "edit"; // 회원 정보 수정 페이지의 뷰 이름
//  }
//
//  // 회원 정보 수정 처리를 위한 컨트롤러 메서드
//  @PostMapping("/edit/{id}")
//  public String editMember(@PathVariable Long id, @ModelAttribute Member memberDetails, Model model) {
//    try {
//      // 회원 정보 수정 서비스 호출
//      memberService.updateMember(id, memberDetails);
//      // 수정 성공 시 홈 페이지로 이동
//      return "redirect:/home";
//    } catch (IllegalArgumentException e) {
//      // 수정 실패 시 에러 메시지를 모델에 추가하여 다시 회원 정보 수정 페이지로 이동
//      model.addAttribute("error", e.getMessage());
//      return "edit"; // 회원 정보 수정 페이지의 뷰 이름
//    }
//  }
//
//  // 회원 삭제 처리를 위한 컨트롤러 메서드
//  @GetMapping("delete")
//  public String delete(int no) throws Exception {
//    if (memberService.delete(no) == 0) {
//      throw new Exception("해당 번호의 회원이 없습니다.");
//    } else {
//      return "redirect:list";
//    }
//  }
//
//  // 여기에 다른 컨트롤러 메서드를 추가할 수 있습니다.
//}
//
