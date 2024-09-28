package Creeper.EV.Repository;

import Creeper.EV.Entity.InfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<InfoEntity, Long> {
    InfoEntity findByBrandAndName(String brand, String name); // 필드와 DB 컬럼을 맞춤
    InfoEntity findByName(String name); 
}
