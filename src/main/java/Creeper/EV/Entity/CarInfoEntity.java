package Creeper.EV.Entity;

import java.math.BigDecimal;

import Creeper.EV.DTO.CarInfoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
@Setter @Getter
@Table(name = "electric_vehicles")
public class CarInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "car_num", nullable = false)// DB ev-project table electric_vehicles car_num
    private Long carNum;                    // 자동차 넘버링

    @Column(name = "brand", nullable = false)                 // DB ev-project table electric_vehicles brand
    private String brand;                   // 브랜드 KR

    @Column(name = "brand_en", nullable = false)              // DB ev-project table electric_vehicles brand_en
    private String brand_en;                // 브랜드 EN

    @Column(name = "name", nullable = false)                  // DB ev-project table electric_vehicles name
    private String name;                    // 자동차 모델명 KR

    @Column(name = "name_en", nullable = false)               // DB ev-project table electric_vehicles name_en
    private String name_en;                 // 자동차 모델명 EN

    @Column(name = "kWh", nullable = true)                   // DB ev-project table electric_vehicles kWh
    private BigDecimal kWh;                 // 자동차 kWh

    @Column(name = "vehicleType", nullable = true)           // DB ev-project table electric_vehicles vehicleType
    private String vehicleType;             // 모델 타입

    public static CarInfoEntity toCarInfoEntity(CarInfoDTO carInfoDTO){
        CarInfoEntity carInfoEntity = new CarInfoEntity();
        carInfoEntity.setCarNum(carInfoDTO.getCarNum());
        carInfoEntity.setBrand(carInfoDTO.getBrand());
        carInfoEntity.setBrand_en(carInfoDTO.getBrand_en());
        carInfoEntity.setName(carInfoDTO.getName());
        carInfoEntity.setName_en(carInfoDTO.getName_en());
        carInfoEntity.setKWh(carInfoDTO.getKWh());
        carInfoEntity.setVehicleType(carInfoDTO.getVehicleType());

        log.debug("Entity: ",carInfoEntity);

        return carInfoEntity; 
    }
}
