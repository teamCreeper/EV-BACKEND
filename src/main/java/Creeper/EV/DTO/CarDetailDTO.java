package Creeper.EV.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CarDetailDTO {
    private Long carId;
    private String batteryId;
    private String carPrice;
    private String motoType;
    private String useableBattery;
    private String zToHundred;
    private String topSpeed;
    private String carRange;
    private String efficiency;
    private String carName;
    private String batteryType;
    private String capacity;
    private String charge_time;
    private String batteryBrandName;
    private String batteryBrandCountry;

    // 배터리 브랜드 별 분리용
    public CarDetailDTO(Long carId, String batteryId, String carName, String batteryType, String capacity, String charge_time, String batteryBrandName, String batteryBrandCountry) {
        this.carId = carId;
        this.batteryId = batteryId;
        this.carName = carName;
        this.batteryType = batteryType;
        this.capacity = capacity;
        this.charge_time = charge_time;
        this.batteryBrandName = batteryBrandName;
        this.batteryBrandCountry = batteryBrandCountry;
    }

    // 메인 페이지 조회용
    public CarDetailDTO(Long carId, String batteryId, String carPrice, String motoType, String useableBattery, String zToHundred, String topSpeed, String carRange, String efficiency, String batteryType, String batteryBrandName, String batteryBrandCountry){
        this.carId = carId;
        this.batteryId = batteryId;
        this.carPrice = carPrice;
        this.motoType = motoType;
        this.useableBattery = useableBattery;
        this.zToHundred = zToHundred;
        this.topSpeed = topSpeed;
        this.carRange = carRange;
        this.efficiency = efficiency;
        this.batteryType = batteryType;
        this.batteryBrandName = batteryBrandName;
        this.batteryBrandCountry = batteryBrandCountry;
    }
}
