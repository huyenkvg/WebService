package com.example.WebService.Mapper;

import com.example.WebService.Entity_BLX.Taikhoan;
import com.example.WebService.DTO.TaikhoanDTO;

public class TaikhoanMapper {
    public static TaikhoanDTO toTaikhoanDTO(Taikhoan tk){
        TaikhoanDTO tmp = new TaikhoanDTO();
        tmp.setTendangnhap(tk.getTendangnhap());
        tmp.setMatkhau(tk.getMatkhau());
        tmp.setTrangthai(tk.getTrangthai());
        return tmp;
    }
}
