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
    private Long id;
    private String Brand; //자동차 브랜드
    private String CarName; //자동차 이름


    public static InfoDTO toInfoDTO(InfoEntity infoEntity){
        InfoDTO infoDTO = new InfoDTO();
        infoDTO.setId(infoEntity.getId());
        infoDTO.setBrand(infoEntity.getBrand());
        infoDTO.setCarName(infoEntity.getCarName());

        return infoDTO;
    }
}
