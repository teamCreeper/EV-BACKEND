package Creeper.EV.Controller;

import Creeper.EV.DTO.InfoDTO;
import Creeper.EV.Entity.InfoEntity;
import Creeper.EV.Service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final InfoService infoService;

    // Index page mapping
    @GetMapping("index")
    public String index() {
        return "index";
    }

    // Saving InfoDTO using the POST request
    @PostMapping("index")
    public String save(@ModelAttribute InfoDTO infoDTO) {
        System.out.println("info DTO check = " + infoDTO);
        infoService.save(infoDTO);
        return "redirect:/index";
    }

    // Fetching car info by brand and name and passing it to the model
    @PostMapping("carDetails")
    public String getCarInfo(@RequestParam String brand, @RequestParam("carName") String carName, Model model) {
        System.out.println("Received brand: " + brand);
        System.out.println("Received carName: " + carName);

        // 서비스로부터 검색된 차 정보를 가져옴
        InfoEntity car = infoService.findCarByBrandAndName(brand, carName);
        System.out.println("Car details: " + car);
        // 뷰로 데이터를 넘김
        model.addAttribute("car", car);
        return "carDetails";
    }
}

