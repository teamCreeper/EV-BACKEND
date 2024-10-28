package Creeper.EV.Service;

import Creeper.EV.Repository.SearchCarRepository;
import Creeper.EV.DTO.SearchCarDTO;
import Creeper.EV.Entity.CarBasicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchCarService {

    @Autowired
    private SearchCarRepository carSearchRepository;

    public List<SearchCarDTO> getCarBasicInfo(String searchKeyword) {
        List<CarBasicInfo> carBasicInfos = carSearchRepository.findByCarNameContaining(searchKeyword);

        return carBasicInfos.stream()
                .map(carBasicinfo -> new SearchCarDTO(carBasicinfo.getCarId(), carBasicinfo.getCarName(), carBasicinfo.getCarBrandId()))
                .collect(Collectors.toList());
    }
}
