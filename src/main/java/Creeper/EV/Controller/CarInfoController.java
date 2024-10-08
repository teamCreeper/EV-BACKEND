package Creeper.EV.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; // 추가된 임포트
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Creeper.EV.DTO.CarInfoDTO;
import Creeper.EV.Service.CarInfoService;

@RestController // @Controller 대신 @RestController 사용
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CarInfoController {
    
    @Autowired
    private CarInfoService carInfoService;

    @GetMapping("/cars") // 경로 변경
    public ResponseEntity<List<CarInfoDTO>> getAllCarInfo() {
        try {
            List<CarInfoDTO> carInfoList = carInfoService.getAllCarInfo();
            return ResponseEntity.ok(carInfoList); // 200 OK 반환
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // 500 상태 반환
        }
    }
}
