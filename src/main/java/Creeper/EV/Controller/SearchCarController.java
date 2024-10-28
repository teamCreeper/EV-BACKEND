package Creeper.EV.Controller;

import Creeper.EV.Service.SearchCarService;
import Creeper.EV.DTO.SearchCarDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class SearchCarController {

    @Autowired
    private SearchCarService carSearchService;

    @GetMapping("/carSearch")
    public ResponseEntity<List<SearchCarDTO>> getcarSearchInfo(@RequestParam("keyword") String searchKeyword) {
        try {
            List<SearchCarDTO> carSearchList = carSearchService.getCarBasicInfo(searchKeyword);
            return ResponseEntity.ok(carSearchList);

        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
