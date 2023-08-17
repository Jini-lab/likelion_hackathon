package CheerUp.cheerupbackend.Controller;

import CheerUp.cheerupbackend.Entity.ButtonClick;
import CheerUp.cheerupbackend.Entity.Scrap;
import CheerUp.cheerupbackend.Repository.ButtonClickRepository;
import CheerUp.cheerupbackend.Service.ButtonClickService;
import CheerUp.cheerupbackend.Service.ScrapService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

//스크랩된 내용을 보여주는 페이지와 관련된 동작을 처리하는 컨트롤러입니다.
//스크랩된 내용을 데이터베이스에서 가져와서 보여주는 페이지를 구현하고,
// 스크랩된 내용을 클라이언트에게 전달하는 역할을 합니다.

@Controller
public class ScrapController {
    private final ButtonClickService buttonClickService;

    public ScrapController(ButtonClickService buttonClickService) {
        this.buttonClickService = buttonClickService;
    }

    @GetMapping("/scrap")
    public String getScrapPage(Model model) {
        Map<String, Integer> buttonClicks = buttonClickService.getButtonClicks();
        model.addAttribute("buttonClicks", buttonClicks);
        return "scrap-list";
    }
}
