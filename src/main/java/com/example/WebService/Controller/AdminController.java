package com.example.WebService.Controller;


import com.example.WebService.DTO.CauhoiDTO;
import com.example.WebService.DTO.TaikhoanDTO;
import com.example.WebService.Dto_Huyen.AdminDto;
import com.example.WebService.Entity_BLX.*;
import com.example.WebService.Mapper.TaikhoanMapper;
import com.example.WebService.Services.AdminService;
import com.example.WebService.Services.Impl.LoaibangServiceImpl;
import com.example.WebService.Services.Impl.TaiKhoanAdminServiceImpl;
import com.example.WebService.Services.TaiKhoanAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/api/admin/")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private TaiKhoanAdminServiceImpl taiKhoanAdminService;
    @Autowired
    private LoaibangServiceImpl bang;
//    @GetMapping("get")
//    public List<AdminDto> getCauhoi() {
//        List<AdminDto> list = adminService.listAllHuyen();
//        return list;
//    }

    public String getAdminInfo(String email)
    {
        List<AdminDto> list = adminService.listAllHuyen();
        for(AdminDto tk : list){
            if(tk.getEmail().trim().equals(email.trim())){
                return tk.getHoten();
            }
        }
        return "Administrator";
    }



    @GetMapping("/dang-nhap")
    public String checkDN(@RequestParam(name="email") String tenDN, @RequestParam(name="password") String mk) throws NoSuchAlgorithmException {
        List<TaikhoanAdmin> list = taiKhoanAdminService.findAll();

        for(TaikhoanAdmin tk : list){
            if(tk.getTendangnhap().trim().equals(tenDN.trim())){
                if(mk.trim().equals(tk.getMatkhau().trim())){
                    return getAdminInfo(tenDN);
                }

                return "sai mật khẩu";
            }
        }
        return "Tài khoản không tồn tại";
    }



    }