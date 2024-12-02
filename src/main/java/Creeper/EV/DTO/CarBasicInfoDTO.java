package Creeper.EV.DTO;

import Creeper.EV.Entity.CarBrand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class CarBasicInfoDTO {
    private Long carId;
    private String carName;
    private CarBrand carBrand;

    public CarBasicInfoDTO(Long carId, String carName, CarBrand carBrand) {
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
    }
}
