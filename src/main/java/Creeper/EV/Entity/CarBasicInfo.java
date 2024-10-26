package Creeper.EV.Entity;

import Creeper.EV.DTO.CarSearchDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @Column(name = "car_brand_id")
    private Long carBrandId;

    // Setter의 대신 생성자로 대체
    public CarBasicInfo(Long carId, String carName, Long carBrandId) {
        this.carId = carId;
        this.carName = carName;
        this.carBrandId = carBrandId;
    }

    public static CarBasicInfo toCarBasicInfo(CarSearchDTO carSearchDTO) {
        CarBasicInfo carBasicInfo = new CarBasicInfo(carSearchDTO.getCarId(), carSearchDTO.getCarName(), carSearchDTO.getCarBrandId());

        return carBasicInfo;
    }
}
