package com.example.WebService.Mapper;

import com.example.WebService.Entity_BLX.Bodethi;
import com.example.WebService.DTO.BodethiDTO;

public class BodethiMapper {
    public static BodethiDTO toBodethiDTO(Bodethi bodethi){
        BodethiDTO tmp = new BodethiDTO();
        tmp.setMabodethi(bodethi.getMabodethi());
        return tmp;
    }
}
