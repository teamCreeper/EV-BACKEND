package Creeper.EV.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class CarBrandDTO {
    private Long brandId;
    private String brandName;

    public CarBrandDTO(Long brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }
}
