package Creeper.EV.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Creeper.EV.DTO.CarDetailInfoDTO;
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

    public List<CarDetailInfoDTO> getCarDetailByCarId(Long carId) {
        // 엔티티 데이터 가져오기
        List<CarDetailInfo> carDetailInfos = carDetailRepository.findByCarId(carId);

        // DTO로 변환
        return carDetailInfos.stream()
            .map(this::convertToDTO)
            .toList();
    }
    
    private CarDetailInfoDTO convertToDTO(CarDetailInfo carDetailInfo) {
        return new CarDetailInfoDTO(
            carDetailInfo.getCarBasicInfo(),
            carDetailInfo.getBatteryInfo(),
            carDetailInfo.getCarPrice(),
            carDetailInfo.getMotoType(),
            carDetailInfo.getUseableBattery(),
            carDetailInfo.getZToHundred(),
            carDetailInfo.getTopSpeed(),
            carDetailInfo.getCarRange(),
            carDetailInfo.getEfficiency()
        );
    }
}
