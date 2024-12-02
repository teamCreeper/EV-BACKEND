package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Creeper.EV.DTO.CarBasicInfoDTO;
import Creeper.EV.Entity.CarBasicInfo;

@Repository
public interface SearchCarRepository extends JpaRepository<CarBasicInfo, Long> {

     @Query("SELECT new Creeper.EV.DTO.CarBasicInfoDTO(c.carId, c.carName, b) " + 
       "FROM CarBasicInfo c JOIN c.carBrand b " +
       "WHERE b.brandId = :carBrandId AND c.carName LIKE CONCAT('%', :carName, '%')")
     List<CarBasicInfoDTO> findByCarBrand_BrandIdAndCarNameContaining(Long carBrandId, String carName);

     List<CarBasicInfo> findAll();
}
