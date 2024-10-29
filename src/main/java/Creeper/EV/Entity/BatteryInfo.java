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
    private Long batteryId;

    @Column(name = "battery_name")
    private String batteryName;

    @ManyToOne
    @JoinColumn(name = "battery_brand_id", referencedColumnName = "brand_id")
    private BatteryBrand batteryBrand;

    public BatteryInfo() {

    }

    public BatteryInfo(Long batteryId, String batteryName, BatteryBrand batteryBrand) {
        this.batteryId = batteryId;
        this.batteryName = batteryName;
        this.batteryBrand = batteryBrand;
    }
}
