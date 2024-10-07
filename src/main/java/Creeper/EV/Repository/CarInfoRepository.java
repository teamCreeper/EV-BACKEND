package Creeper.EV.Repository;

import Creeper.EV.Entity.CarInfoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarInfoRepository extends JpaRepository<CarInfoEntity, Long> {
    List<CarInfoEntity> findAll();
}
