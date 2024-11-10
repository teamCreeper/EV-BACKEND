package Creeper.EV.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Creeper.EV.DTO.CarDetailDTO;
import Creeper.EV.Repository.CarDetailRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CarDetailService {
    
    private final CarDetailRepository carDetailRepository;

    public CarDetailService(CarDetailRepository carDetailRepository) {
        this.carDetailRepository = carDetailRepository;
    }

    public List<CarDetailDTO> getCarDetailByCarId(Long carId) {
        String batteryId = carDetailRepository.findBatteryIdByCarId(carId);

        List<CarDetailDTO> carDetailDTO = carDetailRepository.findByCarBasicInfo_CarIdAndBatteryId(carId, batteryId);

        return carDetailDTO;
    }

    public List<CarDetailDTO> getCarBatteryInfo() {
        List<CarDetailDTO> carDetailDTO = carDetailRepository.findByCarInfo();

        return carDetailDTO;
    }
}
