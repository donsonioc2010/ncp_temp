//package picasso.server.domain.domains.repository;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.NoArgsConstructor;
//
//import java.sql.Date;
//
//import static jakarta.persistence.GenerationType.IDENTITY;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "t_member")
//@NoArgsConstructor
//public class Member {
//
//  @Id
//  @GeneratedValue(strategy = IDENTITY)
//  private Long id;
//  private Long user_id;
//
//  @Column(nullable = false, unique = true)
//  private String email;
//
//  @Column(nullable = false)
//  private String password;
//
//  @Column(nullable = false, unique = true)
//  private String nickname;
//
//  @Column
//  private String profile;
//
//  @Column
//  private Long point;
//
//  @Column(nullable = false)
//  private String login_type;
//
//  @Column(nullable = false)
//  private String status;
//
//  @Column(nullable = false)
//  private String role;
//
//  @Column(nullable = false)
//  private Date created_at;
//
//  @Column(nullable = false)
//  private Date updated_at;
//
//  @Column(nullable = false)
//  private Date login_at;
//
//  @Column(nullable = false)
//  private String access_token;
//
//  @Column(nullable = false)
//  private String refresh_token;
//
//}