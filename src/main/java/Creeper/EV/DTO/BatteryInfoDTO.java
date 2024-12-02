package Creeper.EV.DTO;

import Creeper.EV.Entity.BatteryBrand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class BatteryInfoDTO {
    private String batteryId;
    private String batteryType;
    private BatteryBrand batteryBrand;
    private String capacity;
    private String charge_time;

    public BatteryInfoDTO(String batteryId, String batteryType,BatteryBrand batteryBrand, String capacity, String charge_time) {
        this.batteryId = batteryId;
        this.batteryType = batteryType;
        this.batteryBrand = batteryBrand;
        this.capacity = capacity;
        this.charge_time = charge_time;
    }
}
