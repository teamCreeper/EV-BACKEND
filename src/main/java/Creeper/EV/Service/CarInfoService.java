package Creeper.EV.Service;

import Creeper.EV.DTO.CarInfoDTO;
import Creeper.EV.Entity.CarInfoEntity;
import Creeper.EV.Repository.CarInfoRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarInfoService {
    
    @Autowired
    private CarInfoRepository carInfoRepository;

    public void save(CarInfoDTO carInfoDTO) {
        CarInfoEntity carInfoEntity = CarInfoEntity.toCarInfoEntity(carInfoDTO);
        carInfoRepository.save(carInfoEntity);
    }

    public List<CarInfoDTO> getAllCarInfo(){
        List<CarInfoEntity> carInfos = carInfoRepository.findAll();
        return carInfos.stream()
                .map(carInfo -> new CarInfoDTO(carInfo.getCarNum(), carInfo.getBrand(), carInfo.getBrand_en(), carInfo.getName(), carInfo.getName_en(), carInfo.getKWh(), carInfo.getVehicleType()))
                .collect(Collectors.toList());
    }
}
