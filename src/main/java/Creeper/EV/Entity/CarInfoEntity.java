package Creeper.EV.Entity;

import Creeper.EV.DTO.CarInfoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
@Table(name = "electric_vehicles")
public class CarInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_num")
    private Long carNum;    // DB ev-project table electric_vehicles car_num

    @Column(name = "brand")
    private String brand;   // DB ev-project table electric_vehicles brand

    @Column(unique = true, name = "name")
    private String name;    // DB ev-project table electric_vehicles name

    public static CarInfoEntity toCarInfoEntity(CarInfoDTO carInfoDTO){
        CarInfoEntity carInfoEntity = new CarInfoEntity();
        carInfoEntity.setCarNum(carInfoDTO.getCarNum());
        carInfoEntity.setBrand(carInfoDTO.getBrand());
        carInfoEntity.setName(carInfoDTO.getName());

        return carInfoEntity; 
    }
}
