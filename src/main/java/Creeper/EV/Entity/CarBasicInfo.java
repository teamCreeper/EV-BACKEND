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
@Table(name = "car_basic_info")
public class CarBasicInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", unique = true, nullable = false)
    private Long carId;

    @Column(name = "car_name")
    private String carName;

    @ManyToOne
    @JoinColumn(name = "car_brand_id", referencedColumnName = "brand_id")
    private CarBrand carBrand;

    public CarBasicInfo() { }

    // Setter 대신 생성자로 대체
    public CarBasicInfo(Long carId, String carName, CarBrand carBrand) {
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
    }
}
