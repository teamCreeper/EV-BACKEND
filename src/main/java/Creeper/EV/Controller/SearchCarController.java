package Creeper.EV.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Creeper.EV.DTO.CarBasicInfoDTO;
import Creeper.EV.Entity.CarBasicInfo;
import Creeper.EV.Service.SearchCarService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class SearchCarController {

    private final SearchCarService searchCarService;

    public SearchCarController(SearchCarService searchCarService) {
        this.searchCarService = searchCarService;
    }

    @GetMapping("/searchCar")
    public ResponseEntity<List<CarBasicInfoDTO>> getSearchCarInfo(@RequestParam("brandId") Long brandId, @RequestParam("keyword") String searchKeyword) {
        try {
            List<CarBasicInfoDTO> searchCarList = searchCarService.getCarBasicInfo(brandId, searchKeyword);

            return ResponseEntity.ok(searchCarList);

        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/allCar")
    public ResponseEntity<List<CarBasicInfo>> getAllCar() {
        try {
            List<CarBasicInfo> allCar = searchCarService.getAllCar();

            return ResponseEntity.ok(allCar);
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
