package Creeper.EV.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Creeper.EV.Entity.CarInfoEntity;

public interface CarInfoRepository extends JpaRepository<CarInfoEntity, Long> {
    // 조회 관련 함수들
    // DB 모든 컬럼 조회
    List<CarInfoEntity> findAll();
}
