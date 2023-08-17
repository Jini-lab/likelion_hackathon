package CheerUp.cheerupbackend.Controller;

import CheerUp.cheerupbackend.Service.ButtonClickService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

// 버튼 클릭과 관련된 동작을 처리하는 컨트롤러입니다.
// 버튼 클릭 횟수를 증가시키는 기능을 구현하고, 클릭 횟수 정보를 보여주는 페이지로 이동하는 역할

@Controller
public class ClickController {
    private final ButtonClickService buttonClickService;

    public ClickController(ButtonClickService buttonClickService) {
        this.buttonClickService = buttonClickService;
    }

    @GetMapping("/click")
    public String increaseClickCount(@RequestParam String buttonName) {
        // 버튼 클릭 횟수 증가 로직을 여기에 구현
        // buttonName에 따라 클릭 횟수 증가

        buttonClickService.increaseClickCount(buttonName); // 클릭 횟수 증가

        return "redirect:/buttonPage"; // 버튼이 있는 페이지로 리다이렉트
    }
}






