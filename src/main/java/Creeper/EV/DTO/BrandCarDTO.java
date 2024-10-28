package Creeper.EV.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class BrandCarDTO {
    private Long carId;
    private String carName;
    private Long brandId;
    private String brandName;

    public BrandCarDTO(Long carId, String carName, Long brandId, String brandName) {
        this.carId = carId;
        this.carName = carName;
        this.brandId = brandId;
        this.brandName = brandName;
    }
}
