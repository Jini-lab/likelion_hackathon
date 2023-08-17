package CheerUp.cheerupbackend.Controller;

import CheerUp.cheerupbackend.Entity.Preview;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PreviewController {
    @GetMapping("/previews")
    public String preViewFrom(){
        return "all-view"; // 해당 뷰로 이동
    }


}
