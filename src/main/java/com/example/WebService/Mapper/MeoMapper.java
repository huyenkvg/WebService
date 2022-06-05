package com.example.WebService.Mapper;


import com.example.WebService.Entity_BLX.Meo;
import com.example.WebService.DTO.MeoDTO;

public class MeoMapper {
    public static MeoDTO toLoaiMeoDTO(Meo meo){
        MeoDTO tmp = new MeoDTO();
        tmp.setMaMeo(meo.getMaMeo());
        tmp.setNoidung(meo.getNoidung());
        return tmp;
    }
}
