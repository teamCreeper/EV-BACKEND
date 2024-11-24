package Creeper.EV.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Creeper.EV.DTO.CarDetailDTO;
import Creeper.EV.Entity.CarDetailInfo;
import Creeper.EV.Service.CarDetailService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CarDetailController {
    
    @Autowired
    private CarDetailService carDetailService;

    @GetMapping("/carDetail")
    public ResponseEntity<List<CarDetailInfo>> getCarDetails(@RequestParam("carId") Long carId) {
        try {
            List<CarDetailInfo> carDetail = carDetailService.getCarDetailByCarId(carId);

            return ResponseEntity.ok(carDetail);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/carBatteryInfo")
    public ResponseEntity<List<CarDetailDTO>> getCarBatteryInfo() {
        try {
            List<CarDetailDTO> carDetail = carDetailService.getCarBatteryInfo();

            return ResponseEntity.ok(carDetail);
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
