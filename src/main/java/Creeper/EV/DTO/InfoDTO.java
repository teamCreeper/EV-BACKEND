package Creeper.EV.DTO;

import Creeper.EV.Entity.InfoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Setter
@Getter
public class InfoDTO {
    private Long carNum;
    private String brand; //자동차 브랜드
    private String carName; //자동차 이름

    public static InfoDTO toInfoDTO(InfoEntity infoEntity){
        InfoDTO infoDTO = new InfoDTO();
        infoDTO.setCarNum(infoEntity.getCarNum());
        infoDTO.setBrand(infoEntity.getBrand());
        infoDTO.setCarName(infoEntity.getName());  // name을 carName으로 변경

        return infoDTO;
    }
}
