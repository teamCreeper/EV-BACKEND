package Creeper.EV.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Creeper.EV.Entity.BatteryInfo;

@Repository
public interface BatteryInfoRepository extends JpaRepository<BatteryInfo, String> {


}
