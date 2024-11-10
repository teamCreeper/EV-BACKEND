package Creeper.EV.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class BatteryInfoDTO {
    private String batteryId;
    private String batteryType;
    private Long batteryBrandId;
    private String capacity;
    private String charge_time;

    public BatteryInfoDTO(String batteryId, String batteryType, Long batteryBrandId, String capacity, String charge_time) {
        this.batteryId = batteryId;
        this.batteryType = batteryType;
        this.batteryBrandId = batteryBrandId;
        this.capacity = capacity;
        this.charge_time = charge_time;
    }
}
