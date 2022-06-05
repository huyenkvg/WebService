package com.example.WebService.Mapper;


import com.example.WebService.Entity_BLX.LoaiMeo;
import com.example.WebService.DTO.LoaiMeoDTO;


public class LoaimeoMapper {
    public static LoaiMeoDTO toLoaiMeoDTO(LoaiMeo loaiMeo){
        LoaiMeoDTO tmp = new LoaiMeoDTO();
        tmp.setMaLoaiMeo(loaiMeo.getMaLoaiMeo());
        tmp.setTenLoaiMeo(loaiMeo.getTenLoaiMeo());
        return tmp;
    }
}
