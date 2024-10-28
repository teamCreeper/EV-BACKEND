package Creeper.EV.Service;

import org.springframework.stereotype.Service;

import Creeper.EV.DTO.CarDetailDTO;
import Creeper.EV.Entity.CarDetailInfo;
import Creeper.EV.Repository.CarDetailRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarDetailService {
    
    private final CarDetailRepository carDetailRepository;

    public CarDetailDTO getCarDetail(Long carId) {
        CarDetailInfo carDetailInfo = carDetailRepository.findByCarBasicInfo_CarId(carId);

        if(carDetailInfo != null) {
            return new CarDetailDTO(
                carDetailInfo.getCarBasicInfo().getCarId(),
                carDetailInfo.getBatteryInfo().getBatteryId(),
                carDetailInfo.getCarPrice(),
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
