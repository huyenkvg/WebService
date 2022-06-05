package com.example.WebService.Controller;

import com.example.WebService.Entity_BLX.Taikhoan;
import com.example.WebService.DTO.TaikhoanDTO;
import com.example.WebService.Services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/api/tk/")
public class TaikhoanController {
    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping("get")
    public List<TaikhoanDTO> getTKs() {
        List<TaikhoanDTO> tks = taiKhoanService.getListTaiKhoan();
        return tks;
    }

    @GetMapping("getById")
    public TaikhoanDTO getTKById(@RequestParam(name="tendangnhap") String id){
        TaikhoanDTO tk = taiKhoanService.getTKById(id);
        return tk;
    }

    @GetMapping("dangNhap")
    public Boolean checkDN(@RequestParam(name="tendangnhap") String tenDN,@RequestParam(name="matkhau") String mk) throws NoSuchAlgorithmException {
        TaikhoanDTO taikhoanDTO = getTKById(tenDN);
        String matKhau = taiKhoanService.maHoaMK(mk);
        System.out.println("Mat khau ma hoa: "+matKhau);
        Boolean check =taiKhoanService.checkDangNhap(taikhoanDTO,tenDN,matKhau);
        return check;
    }
//    @PutMapping("updatemk")
//    public Taikhoan uptatemk(Taikhoan taikhoan){
//        Taikhoan tk = taiKhoanService.updateMK_TK(taikhoan);
//        return tk;
//    }


}
