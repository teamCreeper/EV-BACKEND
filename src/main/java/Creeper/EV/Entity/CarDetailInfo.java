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
@Table(name = "car_detail_info")
public class CarDetailInfo {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    // car_id를 독립적으로 선언
    @Column(name = "car_id", insertable = false, updatable = false)
    private Long carId;

    // CarBasicInfo와 연관 관계 설정
    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "car_id")
    private CarBasicInfo carBasicInfo;

    @ManyToOne
    @JoinColumn(name = "battery_id" , referencedColumnName = "battery_id")
    private BatteryInfo batteryInfo;

    @Column(name = "car_price")
    private String carPrice;

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

    public CarDetailInfo(CarBasicInfo carBasicInfo, BatteryInfo batteryInfo, String carPrice, String motoType, String useableBattery, String zToHundred, String topSpeed, String carRange, String efficiency) {
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
