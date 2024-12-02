package Creeper.EV.DTO;

import Creeper.EV.Entity.BatteryInfo;
import Creeper.EV.Entity.CarBasicInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class CarDetailInfoDTO {
    private CarBasicInfo carBasicInfo;
    private BatteryInfo batteryInfo;
    private String carPrice;
    private String motoType;
    private String useableBattery;
    private String zToHundred;
    private String topSpeed;
    private String carRange;
    private String efficiency;

    // 배터리 브랜드 별 분리용
    public CarDetailInfoDTO(CarBasicInfo carBasicInfo, BatteryInfo batteryInfo) {
        this.carBasicInfo = carBasicInfo;
        this.batteryInfo = batteryInfo;
    }

    // 메인 페이지 조회용
    public CarDetailInfoDTO(CarBasicInfo carBasicInfo, BatteryInfo batteryInfo, String carPrice, String motoType, String useableBattery, String zToHundred, String topSpeed, String carRange, String efficiency) {
        this.carBasicInfo = carBasicInfo;
        this.batteryInfo = batteryInfo;
        this.carPrice = carPrice;
        this.motoType = motoType;
        this.useableBattery = useableBattery;
        this.zToHundred = zToHundred;
        this.topSpeed = topSpeed;
        this.carRange = carRange;
        this.efficiency = efficiency;
    }
}
