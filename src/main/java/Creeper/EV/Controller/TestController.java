package Creeper.EV.Controller;

import Creeper.EV.DTO.InfoDTO;
import Creeper.EV.Service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor //InfoService에 대한 멤버를 사용 가능하게함
public class TestController {

    private final InfoService infoService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/index")
    public String save(@ModelAttribute InfoDTO infoDTO){
        System.out.println("info DTO check = " + infoDTO);
        infoService.save(infoDTO);

        return "redirect:/index";
    }
}
