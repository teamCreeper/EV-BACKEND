package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Creeper.EV.DTO.BatteryInfoDTO;
import Creeper.EV.Entity.BatteryInfo;

@Repository
public interface BatteryInfoRepository extends JpaRepository<BatteryInfo, String> {

    @Query("SELECT new Creeper.EV.DTO.BatteryInfoDTO(b.batteryId, b.batteryType, br.brandId, b.capacity, b.charge_time) " +
        "FROM BatteryInfo b JOIN b.batteryBrand br")
    List<BatteryInfoDTO> findAllBattery();
}
