package com.example.WebService.Mapper;

import com.example.WebService.Entity_BLX.Loailithuyet;
import com.example.WebService.DTO.LoailithuyetDTO;

public class LoailithuyetMapper {
    public static LoailithuyetDTO toLoailithuyetDTO(Loailithuyet loailithuyet){
        LoailithuyetDTO tmp = new LoailithuyetDTO();
        tmp.setMaLoaiLiThuyet(loailithuyet.getMaLoaiLiThuyet());
        tmp.setTenloai(loailithuyet.getTenloai());
        return tmp;
    }
}
