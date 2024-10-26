package Creeper.EV.DTO;

import Creeper.EV.Entity.CarBasicInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class CarSearchDTO {
    // 자동차 모델의 고유 번호
    private Long carId; 
    
    // 자동차 모델명
    private String carName;
    
    // 자동차 브랜드의 고유 번호
    private Long carBrandId;

    // Setter의 대신 생성자로 대체
    public CarSearchDTO(Long carId, String carName, Long carBrandId) {
        this.carId = carId;
        this.carName = carName;
        this.carBrandId = carBrandId;
    }

    public static CarSearchDTO toCarSearchDTO(CarBasicInfo carBasicInfo) {
        CarSearchDTO carSearchDTO = new CarSearchDTO(carBasicInfo.getCarId(), carBasicInfo.getCarName(), carBasicInfo.getCarBrandId());

        return carSearchDTO;
    }
}
