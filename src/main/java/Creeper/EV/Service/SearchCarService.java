package Creeper.EV.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Creeper.EV.DTO.SearchCarDTO;
import Creeper.EV.Entity.CarBasicInfo;
import Creeper.EV.Repository.SearchCarRepository;

@Service
public class SearchCarService {

    private final SearchCarRepository carSearchRepository;

    public SearchCarService(SearchCarRepository carSearchRepository) {
        this.carSearchRepository = carSearchRepository;
    }

    public List<SearchCarDTO> getCarBasicInfo(Long brandId, String searchKeyword) {
        List<SearchCarDTO> carBasicInfos = carSearchRepository.findByCarBrand_BrandIdAndCarNameContaining(brandId, searchKeyword);
        
        return carBasicInfos;
    }

    public List<CarBasicInfo> getAllCar() {
        List<CarBasicInfo> allCar = carSearchRepository.findAll();

        return allCar;
    }
}
