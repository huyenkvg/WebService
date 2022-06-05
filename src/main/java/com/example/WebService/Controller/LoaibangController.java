package com.example.WebService.Controller;

import com.example.WebService.DTO.LoaibangDTO;
import com.example.WebService.DTO.TaikhoanDTO;
import com.example.WebService.Entity_BLX.Cauhoi;
import com.example.WebService.Entity_BLX.Loaibang;
import com.example.WebService.Services.LoaibangService;
import com.example.WebService.Services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loaibang/")
public class LoaibangController {
    @Autowired
    private LoaibangService loaibangService;

    @GetMapping("get")
    public List<LoaibangDTO> getListLoaibang() {
        List<LoaibangDTO> list = loaibangService.getListLoaibang();
        return list;
    }

    @PostMapping("save")
    public void ínserLoaibang(@RequestBody Loaibang x) {
        loaibangService.save(x);
    }

    @DeleteMapping("delete")
    public void removeLoaibang(@RequestBody Loaibang x) {
        loaibangService.delete(x);
    }
}
