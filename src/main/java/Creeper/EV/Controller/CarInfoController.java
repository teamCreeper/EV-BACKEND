package Creeper.EV.Controller;

import Creeper.EV.DTO.CarInfoDTO;
import Creeper.EV.Service.CarInfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CarInfoController {
    
    @Autowired
    private CarInfoService carInfoService;

    @GetMapping("/all")
    public List<CarInfoDTO> getAllCarInfo() {
        return carInfoService.getAllCarInfo();
    }
}
