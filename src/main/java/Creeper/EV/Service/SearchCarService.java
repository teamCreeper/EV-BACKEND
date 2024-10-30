package Creeper.EV.Service;

import java.util.List;

import org.springframework.core.annotation.MergedAnnotations.Search;
import org.springframework.stereotype.Service;

import Creeper.EV.DTO.SearchCarDTO;
import Creeper.EV.Repository.SearchCarRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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

    public List<SearchCarDTO> getSearchAllBrandCarInfo(Long brandId) {
        List<SearchCarDTO> carAllBrandCarInfos = carSearchRepository.findAll(brandId);

        return carAllBrandCarInfos;
    }
}
