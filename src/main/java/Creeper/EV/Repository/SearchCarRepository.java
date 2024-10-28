package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Creeper.EV.Entity.CarBasicInfo;

@Repository
public interface SearchCarRepository extends JpaRepository<CarBasicInfo, Long> {
     List<CarBasicInfo> findByCarNameContaining(String searchKeyword);
}
