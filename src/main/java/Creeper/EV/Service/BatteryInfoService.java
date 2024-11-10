package Creeper.EV.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Creeper.EV.DTO.BatteryInfoDTO;
import Creeper.EV.Repository.BatteryInfoRepository;

@Service
public class BatteryInfoService {

    private final BatteryInfoRepository batteryInfoRepository;

    public BatteryInfoService(BatteryInfoRepository batteryInfoRepository) {
        this.batteryInfoRepository = batteryInfoRepository;
    }

    public List<BatteryInfoDTO> getAllBattery() {
        List<BatteryInfoDTO> allBattery = batteryInfoRepository.findAllBattery();

        return allBattery; 
    }
}
