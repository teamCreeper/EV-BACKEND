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
@Table(name = "car_brand")
public class CarBrand {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id", unique = true, nullable = false)
    private Long brandId;

    @Column(name = "brand_name")
    private String brandName;

    public CarBrand() { }

    // Setter 대신 생성자로 대체
    public CarBrand(Long brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }
}
