package picasso.server.api.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import picasso.server.domain.domains.items.Picture;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController {

    @GetMapping("/list")
    public String getPictureList(Model model) {
        // 예시 데이터 생성 (실제로는 데이터베이스에서 가져와야 함)
        List<Picture> pictures = new ArrayList<>();
//        pictures.add(new Picture(1L, "Nature", 100, new Timestamp(System.currentTimeMillis()), "Pending", 1));
//        pictures.add(new Picture(2L, "Cityscape", 150, new Timestamp(System.currentTimeMillis()), "Pending", 2));
        // ... (데이터베이스에서 가져온 데이터를 리스트에 추가)

        model.addAttribute("list", pictures);
        return "list";
    }
}
