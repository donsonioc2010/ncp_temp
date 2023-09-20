package picasso.server.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Set;


@Slf4j
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/payment-test")
    public String payment() {
        return "exchange";
    }
    
    @ResponseBody
    @PostMapping("/payment-test")
    public void sample(@RequestBody Map<String, String> map) throws Exception {
        map.forEach((key, value) -> log.info("key >>> {}, value >>> {}", key, value));
    }
}
