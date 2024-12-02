package Creeper.EV.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Creeper.EV.Service.BatteryInfoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class BatteryInfoController {

    @Autowired
    private BatteryInfoService batteryInfoService;
}
