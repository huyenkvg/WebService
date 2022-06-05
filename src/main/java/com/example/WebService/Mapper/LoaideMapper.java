package com.example.WebService.Mapper;

import com.example.WebService.Entity_BLX.Loaide;
import com.example.WebService.DTO.LoaideDTO;

public class LoaideMapper {
    public static LoaideDTO toLoaideDTO(Loaide loaide){
        LoaideDTO tmp = new LoaideDTO();
        tmp.setMaloaide(loaide.getMaloaide());
        tmp.setTenloaide(loaide.getTenloaide());
        tmp.setSocau(loaide.getSocau());
        tmp.setThoigian(loaide.getThoigian());
        return tmp;
    }
}
