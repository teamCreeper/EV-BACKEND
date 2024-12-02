package Creeper.EV.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class BatteryBrandDTO {
    private Long brandId;
    private String brandName;
    private String brandCountry;
    
    public BatteryBrandDTO(Long brandId, String brandName, String brandCountry) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandCountry = brandCountry;
    }
}
