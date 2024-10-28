package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Creeper.EV.DTO.BrandCarDTO;
import Creeper.EV.Entity.CarBasicInfo;

@Repository
public interface BrandCarRepository extends JpaRepository<CarBasicInfo, Long> {

    @Query("SELECT new Creeper.EV.DTO.BrandCarDTO(c.carId, c.carName, b.brandId, b.brandName) " +
           "FROM CarBasicInfo c JOIN c.carBrand b " +
           "WHERE b.brandId = :brandId")
    List<BrandCarDTO> findCarsByBrandId(@Param("brandId") Long brandId);
}
