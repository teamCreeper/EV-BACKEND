package Creeper.EV.Service;

import org.springframework.stereotype.Service;

import Creeper.EV.Repository.BatteryInfoRepository;

@Service
public class BatteryInfoService {

    private final BatteryInfoRepository batteryInfoRepository;

    public BatteryInfoService(BatteryInfoRepository batteryInfoRepository) {
        this.batteryInfoRepository = batteryInfoRepository;
    }

}
