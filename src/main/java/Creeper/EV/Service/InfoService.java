package Creeper.EV.Service;

import Creeper.EV.DTO.InfoDTO;
import Creeper.EV.Entity.InfoEntity;
import Creeper.EV.Repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //스프링이 관리해주는 객체 == 스프링 빈
@RequiredArgsConstructor //contoller처럼 final 멤버변수 생성자 만드는 역할
public class InfoService {

    private final InfoRepository infoRepository;

    public void save(InfoDTO infoDTO) {
        InfoEntity infoEntity = InfoEntity.toInfoEntity(infoDTO);
        infoRepository.save(infoEntity);
        //Repository의 save메서드 호출 (entity 객체를 넘겨줘야 함)
    }
}
