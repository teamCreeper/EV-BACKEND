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

import Creeper.EV.DTO.SearchCarDTO;
import Creeper.EV.Service.SearchCarService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class SearchCarController {

    @Autowired
    private SearchCarService searchCarService;

    @GetMapping("/searchCar")
    public ResponseEntity<List<SearchCarDTO>> getSearchCarInfo(@RequestParam("brandId") Long brandId, @RequestParam("keyword") String searchKeyword) {
        try {
            List<SearchCarDTO> searchCarList = searchCarService.getCarBasicInfo(brandId, searchKeyword);

            return ResponseEntity.ok(searchCarList);

        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/searchBrandCar")
    public ResponseEntity<List<SearchCarDTO>> getSearchAllBrandCarInfo(@RequestParam("brandId") Long brandId) {
        try {
            List<SearchCarDTO> searchCarList = searchCarService.getSearchAllBrandCarInfo(brandId);

            return ResponseEntity.ok(searchCarList);
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
