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

@Entity
@Setter @Getter
@Table(name = "electric_vehicles")
public class CarInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "car_num", nullable = false) // DB ev-project table electric_vehicles car_num
    private Long carNum; // 자동차 넘버링

    @Column(name = "brand") // DB ev-project table electric_vehicles brand
    private String brand; // 브랜드 KR

    @Column(name = "brand_en") // DB ev-project table electric_vehicles brand_en
    private String brand_en; // 브랜드 EN

    @Column(name = "name") // DB ev-project table electric_vehicles name
    private String name; // 자동차 모델명 KR

    @Column(name = "name_en") // DB ev-project table electric_vehicles name_en
    private String name_en; // 자동차 모델명 EN

    @Column(name = "kwh_value", nullable = true) // DB ev-project table electric_vehicles kWh
    private BigDecimal kwh_value; // 자동차 kWh

    @Column(name = "vehicle_type", nullable = true) // DB ev-project table electric_vehicles vehicleType
    private String vehicle_type; // 모델 타입ble electric_vehicles vehicleType

    public static CarInfoEntity toCarInfoEntity(CarInfoDTO carInfoDTO){
        CarInfoEntity carInfoEntity = new CarInfoEntity();
        carInfoEntity.setCarNum(carInfoDTO.getCarNum());
        carInfoEntity.setBrand(carInfoDTO.getBrand());
        carInfoEntity.setBrand_en(carInfoDTO.getBrand_en());
        carInfoEntity.setName(carInfoDTO.getName());
        carInfoEntity.setName_en(carInfoDTO.getName_en());
        carInfoEntity.setKwh_value(carInfoDTO.getKwh_value());
        carInfoEntity.setVehicle_type(carInfoDTO.getVehicle_type());

        return carInfoEntity; 
    }
}
