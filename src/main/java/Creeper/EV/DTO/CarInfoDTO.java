package Creeper.EV.DTO;

import Creeper.EV.Entity.CarInfoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter @Setter
public class CarInfoDTO {
    private Long carNum;
    private String brand;
    private String name;

    // 매개변수를 받는 생성자 추가
    public CarInfoDTO(Long carNum, String brand, String name) {
        this.carNum = carNum;
        this.brand = brand;
        this.name = name;
    }

    public static CarInfoDTO toCarInfoDTO(CarInfoEntity carInfoEntity) {
        CarInfoDTO carInfoDTO = new CarInfoDTO();

        carInfoDTO.setCarNum(carInfoEntity.getCarNum());
        carInfoDTO.setBrand(carInfoEntity.getBrand());
        carInfoDTO.setName(carInfoEntity.getName());

        return carInfoDTO;
    }
}