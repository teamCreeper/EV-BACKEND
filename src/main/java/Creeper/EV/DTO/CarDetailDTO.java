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
    private String carPrise;
    private String motoType;
    private String useableBattery;
    private String zToHundred;
    private String topSpeed;
    private String carRange;
    private String efficiency;

    public CarDetailDTO(Long carId, Long batteryId, String carPrise, String motoType, String useableBattery, String zToHundred, String topSpeed, String carRange, String efficiency){
        this.carId = carId;
        this.batteryId = batteryId;
        this.carPrise = carPrise;
        this.motoType = motoType;
        this.useableBattery = useableBattery;
        this.zToHundred = zToHundred;
        this.topSpeed = topSpeed;
        this.carRange = carRange;
        this.efficiency = efficiency;
    }
}
