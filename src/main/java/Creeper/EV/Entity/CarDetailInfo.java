package Creeper.EV.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "car_detail_info")
public class CarDetailInfo {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable =false)
    private Long id;

    @Column(name = "car_id")
    private Long carId;

    @Column(name = "battery_id")
    private Long batteryId;

    @Column(name = "car_price")
    private String carPrise;

    @Column(name = "moto_type")
    private String motoType;

    @Column(name = "useable_battery")
    private String useableBattery;

    @Column(name = "zero_to_hundred")
    private String zToHundred;

    @Column(name = "top_speed")
    private String topSpeed;

    @Column(name = "car_range")
    private String carRange;

    @Column(name = "efficiency")
    private String efficiency;

    public CarDetailInfo() {
        // JPA용
    }

    public CarDetailInfo(Long carId, Long batteryId, String carPrise, String motoType, String useableBattery, String zToHundred, String topSpeed, String carRange, String efficiency) {
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
