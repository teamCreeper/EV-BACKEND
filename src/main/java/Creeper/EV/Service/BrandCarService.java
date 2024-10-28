package Creeper.EV.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Creeper.EV.DTO.BrandCarDTO;
import Creeper.EV.Repository.BrandCarRepository;

@Service
public class BrandCarService {
    
    // 이 구조 공부할 것
    private final BrandCarRepository brandCarRepository;

    public BrandCarService(BrandCarRepository brandCarRepository) {
        this.brandCarRepository = brandCarRepository;
    }

    public List<BrandCarDTO> getCarsByBrand(Long brandId) {
        return brandCarRepository.findCarsByBrandId(brandId);
    }
}
