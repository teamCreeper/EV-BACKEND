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

    // 배터리 브랜드 별 분리용
    @Query("SELECT new Creeper.EV.DTO.CarDetailDTO(c.carId, b.batteryId, c.carName, batteryType, b.capacity, b.charge_time, br.brandName, br.brandCountry) " +
    "FROM CarDetailInfo d JOIN d.carBasicInfo c JOIN d.batteryInfo b JOIN b.batteryBrand br ")
    List<CarDetailDTO> findByCarInfo();

    // 메인 페이지 조회용
    @Query("SELECT b.batteryId FROM CarDetailInfo d JOIN d.batteryInfo b WHERE d.carBasicInfo.carId = :carId")
    String findBatteryIdByCarId(@Param("carId") Long carId);
    
    // 메인 페이지 조회용
    @Query("SELECT new Creeper.EV.DTO.CarDetailDTO(c.carId, b.batteryId, d.carPrice, d.motoType, d.useableBattery, d.zToHundred, d.topSpeed, d.carRange, d.efficiency, b.batteryType, br.brandName, br.brandCountry) " +
    "FROM CarDetailInfo d JOIN d.carBasicInfo c JOIN d.batteryInfo b JOIN b.batteryBrand br " +
    "WHERE c.carId = :carId AND b.batteryId = :batteryId")
    List<CarDetailDTO> findByCarBasicInfo_CarIdAndBatteryId(@Param("carId") Long carId, @Param("batteryId") String batteryId);
}

