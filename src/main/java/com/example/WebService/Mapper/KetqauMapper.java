package com.example.WebService.Mapper;


import com.example.WebService.Entity_BLX.Ketqua;
import com.example.WebService.DTO.KetquaDTO;

public class KetqauMapper {
    public static KetquaDTO toKetquaDTO(Ketqua ketqua){
        KetquaDTO tmp = new KetquaDTO();
        tmp.setId(ketqua.getId());
        tmp.setPhuongan(ketqua.getPhuongan());
        tmp.setLuotthi(ketqua.getLuotthi());
        return tmp;
    }
}
