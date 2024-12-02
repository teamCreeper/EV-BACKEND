package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Creeper.EV.DTO.CarDetailInfoDTO;
import Creeper.EV.Entity.CarBasicInfo;
import Creeper.EV.Entity.CarDetailInfo;

@Repository
public interface CarDetailRepository extends JpaRepository<CarDetailInfo, Long> {    
    @Query("SELECT c FROM CarDetailInfo c WHERE c.carBasicInfo.carId = :carId")
    List<CarDetailInfo> findByCarId(@Param("carId") Long carId);

    List<CarDetailInfo> findByCarBasicInfo(CarBasicInfo carBasicInfo);
}

