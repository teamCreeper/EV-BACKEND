package Creeper.EV.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Creeper.EV.DTO.BatteryInfoDTO;
import Creeper.EV.Service.BatteryInfoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class BatteryInfoController {

    @Autowired
    private BatteryInfoService batteryInfoService;

    @GetMapping("/allBattery")
    public ResponseEntity<List<BatteryInfoDTO>> getAllBattery() {
        try {
            List<BatteryInfoDTO> allBattery = batteryInfoService.getAllBattery();

            return ResponseEntity.ok(allBattery);
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
