package picasso.server.domain.domains.admin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
    @Entity
    @Getter
    @Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardNo; // 게시물 번호
    private Timestamp createdDate; // 게시물 생성일
    private String changeToApproveStatue; // 승인상태변경
        private boolean approve;           // 승인
        }

