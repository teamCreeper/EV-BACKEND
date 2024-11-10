package Creeper.EV.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "battery_info")
public class BatteryInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "battery_id", unique = true, nullable = false)
    private String batteryId;

    @Column(name = "battery_type")
    private String batteryType;

    @ManyToOne
    @JoinColumn(name = "battery_brand_id", referencedColumnName = "brand_id")
    private BatteryBrand batteryBrand;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "charge_time")
    private String charge_time;

    public BatteryInfo() {

    }

    public BatteryInfo(String batteryId, String batteryType, BatteryBrand batteryBrand, String capacity, String charge_time) {
        this.batteryId = batteryId;
        this.batteryType = batteryType;
        this.batteryBrand = batteryBrand;
        this.capacity = capacity;
        this.charge_time = charge_time;
    }
}
