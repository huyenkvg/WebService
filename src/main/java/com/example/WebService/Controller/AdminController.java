package com.example.WebService.Controller;


import com.example.WebService.Entity_BLX.Admin;
import com.example.WebService.Entity_BLX.Loaibang;
import com.example.WebService.Services.AdminService;
import com.example.WebService.Services.Impl.LoaibangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test/")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private LoaibangServiceImpl bang;
    //lay toàn bộ thông tin
    @GetMapping("get")
    public List<Admin> getAdmin() {
        List<Admin> adminList = adminService.listAll();
        adminList.forEach(c -> {
            System.out.println(c.showSth());
        });
        return adminList;
    }
//    @GetMapping("get2")
//    public List<Loaibang> getbang() {
//        List<Loaibang> adminList = bang.findAll();
//        return adminList;
//    }
//    // lay thông tin theo mã
//    @GetMapping("{maThuongHieu}")
//    public String get1ThuongHieu(  @PathVariable String maThuongHieu) {
//        Optional<THUONG_HIEU> t=thuongHieuService.get(maThuongHieu);
//        String a=t.toString();
//        return a;
//    }
    // chỉnh sửa toàn bộ tên theo mã có sẵn trong database
    @PostMapping("/edit")
    public List<Admin> postThuongHieu(@RequestBody Admin admin) {
        List<Admin> adList = adminService.listAll();
        adList.add(admin);
        adminService.save(admin);
        return adList;
    }
//
//    //edit thông tin theo mã
//    @PostMapping("/edit/{maThuongHieu}")
//    public void edit1ThuongHieu(@PathVariable @RequestBody String maThuongHieu,
//                                @RequestBody String tenThuongHieu) {
//        thuongHieuService.editByMa(maThuongHieu, tenThuongHieu);
//    }
//    //=== thêm thương hiệu======
//    @PostMapping("insert")
//    public void insert (@RequestBody THUONG_HIEU thuonghieu){
//        thuongHieuService.insert(thuonghieu.getMaThuongHieu(),thuonghieu.getTenThuongHieu());
//    }
//    //========= delete thuong hiệu
//    @DeleteMapping("delete")
//    public void delete (@RequestBody String id){
//        thuongHieuService.delete(id);
//    }
}