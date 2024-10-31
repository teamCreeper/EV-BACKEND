package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Creeper.EV.DTO.SearchCarDTO;
import Creeper.EV.Entity.CarBasicInfo;

@Repository
public interface SearchCarRepository extends JpaRepository<CarBasicInfo, Long> {

     @Query("SELECT new Creeper.EV.DTO.SearchCarDTO(c.carId, c.carName, b.brandId) " + 
     "FROM CarBasicInfo c JOIN c.carBrand b " +
     "WHERE b.brandId = :carBrandId AND c.carName LIKE CONCAT('%', :carName, '%')")
     List<SearchCarDTO> findByCarBrand_BrandIdAndCarNameContaining(Long carBrandId, String carName);

     @Query("SELECT new Creeper.EV.DTO.SearchCarDTO(c.carId, c.carName, b.brandId) " +
     "FROM CarBasicInfo c JOIN c.carBrand b ")
     List<SearchCarDTO> findAllCar();
}
