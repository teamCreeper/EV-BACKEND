package Creeper.EV.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Creeper.EV.DTO.CarDetailDTO;
import Creeper.EV.Service.CarDetailService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CarDetailController {
    
    @Autowired
    private CarDetailService carDetailService;

    @GetMapping("/carDetail")
    public ResponseEntity<CarDetailDTO> getCarDetails(@RequestParam("carId") Long carId) {
        try {
            CarDetailDTO carDetail = carDetailService.getCarDetail(carId);
            return ResponseEntity.ok(carDetail);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
