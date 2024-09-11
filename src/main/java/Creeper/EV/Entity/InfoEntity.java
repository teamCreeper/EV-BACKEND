package Creeper.EV.Entity;

import Creeper.EV.DTO.InfoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "electric_vehicles")
public class InfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_num")
    private Long carNum;

    @Column(name = "brand")
    private String brand;

    @Column(unique = true, name = "name")
    private String name;  // carName을 name으로 변경

    public static InfoEntity toInfoEntity(InfoDTO infoDTO){
        InfoEntity infoEntity = new InfoEntity();
        infoEntity.setCarNum(infoDTO.getCarNum());
        infoEntity.setBrand(infoDTO.getBrand());
        infoEntity.setName(infoDTO.getCarName());  // carName을 name으로 변경

        return infoEntity;
    }
}
