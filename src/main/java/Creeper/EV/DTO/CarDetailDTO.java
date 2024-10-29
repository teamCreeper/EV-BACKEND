package Creeper.EV.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class CarDetailDTO {
    private Long carId;
    private Long batteryId;
    private String carPrice;
    private String motoType;
    private String useableBattery;
    private String zToHundred;
    private String topSpeed;
    private String carRange;
    private String efficiency;
    private String batteryName;
    private String batteryBrandName;
    private String batteryBrandCountry;

    public CarDetailDTO(Long carId, Long batteryId, String carPrice, String motoType, String useableBattery, String zToHundred, String topSpeed, String carRange, String efficiency, String batteryName, String batteryBrandName, String batteryBrandCountry){
        this.carId = carId;
        this.batteryId = batteryId;
        this.carPrice = carPrice;
        this.motoType = motoType;
        this.useableBattery = useableBattery;
        this.zToHundred = zToHundred;
        this.topSpeed = topSpeed;
        this.carRange = carRange;
        this.efficiency = efficiency;
        this.batteryName = batteryName;
        this.batteryBrandName = batteryBrandName;
        this.batteryBrandCountry = batteryBrandCountry;
    }
}
