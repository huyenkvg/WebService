package com.example.WebService.Mapper;

import com.example.WebService.Entity_BLX.LoaiLuatGt;
import com.example.WebService.DTO.LoaiLuatDTO;

public class LoailuatMapper {
    public static LoaiLuatDTO toLoailuatDTO(LoaiLuatGt loaiLuatGt){
        LoaiLuatDTO tmp = new LoaiLuatDTO();
        tmp.setMaLoaiLuatGt(loaiLuatGt.getMaLoaiLuatGt());
        tmp.setTenLoaiLuatGt(loaiLuatGt.getTenLoaiLuatGt());
        return tmp;
    }
}
