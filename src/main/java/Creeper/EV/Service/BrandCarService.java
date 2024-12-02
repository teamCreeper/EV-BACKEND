package Creeper.EV.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Creeper.EV.Entity.CarBasicInfo;
import Creeper.EV.Repository.CarBasicInfoRepository;

@Service
public class BrandCarService {
    
    private final CarBasicInfoRepository carBasicInfoRepository;

    public BrandCarService(CarBasicInfoRepository carBasicInfoRepository) {
        this.carBasicInfoRepository = carBasicInfoRepository;
    }

    public List<CarBasicInfo> getCarsByBrand(Long brandId) {
        return carBasicInfoRepository.findByBrandId(brandId);
    }
}
