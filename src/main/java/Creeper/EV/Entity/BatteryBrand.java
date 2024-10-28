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
@Table(name = "battery_brand")
public class BatteryBrand {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id", unique = true, nullable = false)
    private Long brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "brand_country")
    private String brandCountry;

    public BatteryBrand() {

    }

    public BatteryBrand(Long brandId, String brandName, String brandCountry) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandCountry = brandCountry;
    }
}
