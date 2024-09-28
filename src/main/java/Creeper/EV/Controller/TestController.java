package Creeper.EV.Controller;

import Creeper.EV.DTO.InfoDTO;
import Creeper.EV.Entity.InfoEntity;
import Creeper.EV.Service.InfoService;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000") // React 앱의 주소로 변경
public class TestController {

    private final InfoService infoService;

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @PostMapping("index")
    public String save(@ModelAttribute InfoDTO infoDTO) {
        System.out.println("info DTO check = " + infoDTO);
        infoService.save(infoDTO);
        return "redirect:/index";
    }

    @PostMapping("/api/carDetails")
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

    @PostMapping("/api/search")
    @ResponseBody
    public Map<String, String> searchCarByName(@RequestParam("carName") String carName) {
        System.out.println("Received carName: " + carName); // 수신한 carName 로그 추가

        InfoEntity car = infoService.findCarByName(carName);

        if (car == null) {
            System.out.println("Car not found for name: " + carName);
            // 검색 결과가 없을 경우 처리
            Map<String, String> response = new HashMap<>();
            response.put("error", "Car not found");
            return response;
        }

        // 검색된 car 객체로부터 브랜드를 가져와 JS 파일 이름을 생성
        String jsFileName = car.getBrand() + "model.js"; // 예: HyundaiModel.js
        System.out.println("Model.js: " + jsFileName);

        // JS 파일 이름을 JSON 형태로 프론트엔드에 반환
        Map<String, String> response = new HashMap<>();
        response.put("jsFile", jsFileName);
        return response;
    }
}
