package com.example.WebService.Services;

import com.example.WebService.DTO.TaikhoanDTO;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface TaiKhoanService {
    //  Taikhoan updateMK_TK(Taikhoan taikhoan);

    List<TaikhoanDTO> getListTaiKhoan();

    TaikhoanDTO getTKById(String id);

    String maHoaMK(String mk) throws NoSuchAlgorithmException;

    Boolean checkDangNhap(TaikhoanDTO taikhoanDTO, String tk, String mk);
}
