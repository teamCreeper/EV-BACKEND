package Creeper.EV.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Creeper.EV.Entity.CarBasicInfo;
import Creeper.EV.Service.BrandCarService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class BrandCarController {
    
    @Autowired
    private BrandCarService brandCarService;

    @GetMapping("/brandCars")
    public List<CarBasicInfo> getCarsByBrand(@RequestParam("brandId") Long brandId) {
        return brandCarService.getCarsByBrand(brandId);
    }
}
