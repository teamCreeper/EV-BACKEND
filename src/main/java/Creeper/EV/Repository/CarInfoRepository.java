package Creeper.EV.Repository;

import Creeper.EV.Entity.CarInfoEntity;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarInfoRepository extends JpaRepository<CarInfoEntity, Long> {
    // 조회 관련 함수들
    // DB 모든 컬럼 조회
    List<CarInfoEntity> findAll();

    // 특정 브랜드 KR 조회
    List<CarInfoEntity> findByBrand(String brand);

    // 특정 브랜드 EN 조회
    List<CarInfoEntity> findByBrandEn(String brand_en);

    // 특정 모델명 KR 조회
    List<CarInfoEntity> findByName(String name);

    // 특정 모델명 EN 조회
    List<CarInfoEntity> findByNameEn(String name_en);

    // 상세페이지 관련 함수들
    // 모델 kWh 출력
    List<CarInfoEntity> showKWh(BigDecimal kWh);

    // 모델 구동 타입 출력
    List<CarInfoEntity> showVehicleType(String vehicleType);
}
