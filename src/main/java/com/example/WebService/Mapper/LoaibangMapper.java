package com.example.WebService.Mapper;

import com.example.WebService.Entity_BLX.Loaibang;
import com.example.WebService.DTO.LoaibangDTO;

public class LoaibangMapper {
    public static LoaibangDTO toLoaibangDTO(Loaibang loaibang){
        LoaibangDTO tmp = new LoaibangDTO();
        tmp.setMaloaibang(loaibang.getMaloaibang());
        tmp.setTenloaibang(loaibang.getTenloaibang());
        return tmp;
    }
}
