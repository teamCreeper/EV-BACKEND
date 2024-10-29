package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Creeper.EV.DTO.CarDetailDTO;
import Creeper.EV.Entity.CarDetailInfo;

@Repository
public interface CarDetailRepository extends JpaRepository<CarDetailInfo, Long> {
    
    @Query("SELECT b.batteryId FROM CarDetailInfo d JOIN d.batteryInfo b WHERE d.carBasicInfo.carId = :carId")
    Long findBatteryIdByCarId(Long carId);
    
    @Query("SELECT new Creeper.EV.DTO.CarDetailDTO(c.carId, b.batteryId, d.carPrice, d.motoType, d.useableBattery, d.zToHundred, d.topSpeed, d.carRange, d.efficiency, b.batteryName, br.brandName, br.brandCountry) " +
       "FROM CarDetailInfo d JOIN d.carBasicInfo c JOIN d.batteryInfo b JOIN b.batteryBrand br " +
       "WHERE c.carId = :carId AND b.batteryId = :batteryId")
    List<CarDetailDTO> findByCarBasicInfo_CarIdAndBatteryId(@Param("carId") Long carId, @Param("batteryId") Long batteryId);
}

