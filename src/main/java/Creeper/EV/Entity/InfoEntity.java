package Creeper.EV.Entity;

import Creeper.EV.DTO.InfoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "info_table")
public class InfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String temp;

    public static InfoEntity toInfoEntity(InfoDTO infoDTO){
        InfoEntity infoEntity = new InfoEntity();
        infoEntity.setId(infoDTO.getId());
        infoEntity.setTemp(infoDTO.getTemp());
        return infoEntity;
    }
}
