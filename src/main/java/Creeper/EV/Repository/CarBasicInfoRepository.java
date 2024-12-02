package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Creeper.EV.Entity.CarBasicInfo;

@Repository
public interface CarBasicInfoRepository extends JpaRepository<CarBasicInfo, Long> {

    @Query("SELECT cbi FROM CarBasicInfo cbi JOIN cbi.carBrand cb WHERE cb.brandId = :brandId")
    List<CarBasicInfo> findByBrandId(@Param("brandId") Long brandId);
}
