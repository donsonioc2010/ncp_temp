package picasso.server.api.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import picasso.server.api.admin.dto.response.BoardResponseDTO;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/list")
    public String adminBoardlist() {
        List<BoardResponseDTO> list = new ArrayList<>();
        list.add(BoardResponseDTO.builder()
                .id(1L)
                .startAmount(10000L)
                .title("제목1")
                .build());


        return "admin/list";
    }
}
