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
    private String temp;

    public static InfoDTO toInfoDTO(InfoEntity infoEntity){
        InfoDTO infoDTO = new InfoDTO();
        infoDTO.setId(infoEntity.getId());
        infoDTO.setTemp(infoEntity.getTemp());

        return infoDTO;
    }
}
