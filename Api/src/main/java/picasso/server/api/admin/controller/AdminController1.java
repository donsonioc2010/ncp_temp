package picasso.server.api.admin.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.admin.service.AdminService;
import picasso.server.domain.domains.dto.AdminBoardDTO;

@Slf4j
@RequestMapping("/admin1")
@Controller
public class AdminController1 {


    @GetMapping("list")
    public void list(int category, Model model) throws Exception {
        model.addAttribute("list", boardService.list(category));
    }


    @GetMapping("delete")
    public String delete(int no, int category, HttpSession session) throws Exception {
        BoardResponseDTO Timestamp = (BoardResponseDTO) session.getAttribute("created_at");
        if (Timestamp.getCreated_at() >) {
            return "redirect:/admin1/list";
        }

        BoardResponseDTO boardResponseDTO = adminService.get(no);

            return "redirect:/admin1/list?category=" + category;
        }
    }

    @GetMapping("detail/{category}/{no}")
    public String detail(@PathVariable int category, @PathVariable int no, Model model) throws Exception {
        AdminBoardDTO adminBoardDTO = AdminService.get(no);
        if (board != null) {
            boardService.increaseViewCount(no);
            model.addAttribute("board", board);
        }
        return "board/detail";
    }

    @GetMapping("list")
    public void list(int category, Model model) throws Exception {
        model.addAttribute("list", boardService.list(category));
    }


}
