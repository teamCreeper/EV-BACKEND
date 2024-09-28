package Creeper.EV.Service;

import Creeper.EV.DTO.InfoDTO;
import Creeper.EV.Entity.InfoEntity;
import Creeper.EV.Repository.InfoRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //스프링이 관리해주는 객체 == 스프링 빈
@RequiredArgsConstructor //contoller처럼 final 멤버변수 생성자 만드는 역할
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    public void save(InfoDTO infoDTO) {
        InfoEntity infoEntity = InfoEntity.toInfoEntity(infoDTO);
        infoRepository.save(infoEntity);
        //Repository의 save메서드 호출 (entity 객체를 넘겨줘야 함)
    }

    public InfoEntity findCarByBrandAndName(String brand, String name){
        // DB에서 브랜드와 이름으로 자동차 정보를 찾는 로직
        return infoRepository.findByBrandAndName(brand, name);
    }

    // 이름으로 자동차 검색 (새로 추가된 메서드)
    public InfoEntity findCarByName(String name) {
        return infoRepository.findByName(name);
    }
}
