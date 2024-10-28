package Creeper.EV.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Creeper.EV.DTO.CarDetailDTO;
import Creeper.EV.Entity.CarDetailInfo;
import Creeper.EV.Repository.CarDetailRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarDetailService {
    
    @Autowired
    private CarDetailRepository carDetailRepository;

    public CarDetailDTO getCarDetail(Long carId) {
        CarDetailInfo carDetailInfo = carDetailRepository.findByCarId(carId);

        if(carDetailInfo != null) {
            return new CarDetailDTO(
                carDetailInfo.getCarId(),
                carDetailInfo.getBatteryId(),
                carDetailInfo.getCarPrise(),
                carDetailInfo.getMotoType(),
                carDetailInfo.getUseableBattery(),
                carDetailInfo.getZToHundred(),
                carDetailInfo.getTopSpeed(),
                carDetailInfo.getCarRange(),
                carDetailInfo.getEfficiency()
            );
        }

        return null;
    }
}
