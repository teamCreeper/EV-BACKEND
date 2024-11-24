package Creeper.EV.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Creeper.EV.DTO.CarDetailDTO;
import Creeper.EV.Entity.CarDetailInfo;
import Creeper.EV.Repository.CarDetailRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CarDetailService {
    
    private final CarDetailRepository carDetailRepository;

    public CarDetailService(CarDetailRepository carDetailRepository) {
        this.carDetailRepository = carDetailRepository;
    }

    public List<CarDetailInfo> getCarDetailByCarId(Long carId) {
        List<CarDetailInfo> carDetailInfos = carDetailRepository.findByCarId(carId);

        return carDetailInfos;
    }

    public List<CarDetailDTO> getCarBatteryInfo() {
        List<CarDetailDTO> carDetailDTO = carDetailRepository.findByCarInfo();

        return carDetailDTO;
    }
}
