package Creeper.EV.DTO;

import java.math.BigDecimal;

import Creeper.EV.Entity.CarInfoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter @Setter
public class CarInfoDTO {
    private Long carNum;            // 자동차 넘버링 (고유키)
    private String brand;           // 브랜드 KR
    private String brand_en;        // 브랜드 EN
    private String name;            // 자동차 모델명 KR
    private String name_en;         // 자동차 모델명 EN
    private BigDecimal kWh;         // 자동차 kWh
    private String vehicleType;     // 자동차 구동 모델


    // 매개변수를 받는 생성자 추가
    public CarInfoDTO(Long carNum, String brand, String brand_en, String name, String name_en, BigDecimal kWh, String vehicleType) {
        this.carNum = carNum;
        this.brand = brand;
        this.brand_en = brand_en;
        this.name = name;
        this.name_en = name_en;
        this.kWh = kWh;
        this.vehicleType = vehicleType;
    }

    public static CarInfoDTO toCarInfoDTO(CarInfoEntity carInfoEntity) {
        CarInfoDTO carInfoDTO = new CarInfoDTO();

        carInfoDTO.setCarNum(carInfoEntity.getCarNum());
        carInfoDTO.setBrand(carInfoEntity.getBrand());
        carInfoDTO.setBrand_en(carInfoEntity.getBrand_en());
        carInfoDTO.setName(carInfoEntity.getName());
        carInfoDTO.setName_en(carInfoEntity.getName_en());
        carInfoDTO.setKWh(carInfoEntity.getKWh());
        carInfoDTO.setVehicleType(carInfoEntity.getVehicleType());

        return carInfoDTO;
    }
}