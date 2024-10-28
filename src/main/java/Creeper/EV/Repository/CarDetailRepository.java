package Creeper.EV.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Creeper.EV.Entity.CarDetailInfo;

@Repository
public interface CarDetailRepository extends JpaRepository<CarDetailInfo, Long> { // Entity를 첫 번째 제네릭 타입으로 설정
    CarDetailInfo findByCarId(Long carId);
}
