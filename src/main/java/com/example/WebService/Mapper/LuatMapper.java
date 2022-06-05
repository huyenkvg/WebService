package com.example.WebService.Mapper;

import com.example.WebService.Entity_BLX.LuatGt;
import com.example.WebService.DTO.LuatDTO;

public class LuatMapper {
    public static LuatDTO toLuatDTO(LuatGt luatGt){
        LuatDTO tmp = new LuatDTO();
        tmp.setMaluat(luatGt.getMaluat());
        tmp.setNoidung(luatGt.getNoidung());
        tmp.setMucphat(luatGt.getMucphat());
        return tmp;
    }
}
