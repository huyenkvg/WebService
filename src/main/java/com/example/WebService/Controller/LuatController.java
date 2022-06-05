package com.example.WebService.Controller;

import com.example.WebService.DTO.LoaiLuatDTO;
import com.example.WebService.DTO.LuatDTO;
import com.example.WebService.Entity_BLX.LuatGt;
import com.example.WebService.Services.LoaiLuatGtService;
import com.example.WebService.Services.LuatGtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/luat/")
public class LuatController {
    @Autowired
    private LuatGtService luatGtService;

    @Autowired
    private LoaiLuatGtService loaiLuatGtService;

    @GetMapping("getLoailuat")
    public List<LoaiLuatDTO> getLoaiLuat() {
        List<LoaiLuatDTO> list = loaiLuatGtService.getListLoailuat();
        return list;
    }

    @GetMapping("getLuat")
    public List<LuatDTO> getMeo(@RequestParam(name="maloailuat") Integer maloailuat) {
        List<LuatDTO> result = luatGtService.getLuatByLoaiLuat(maloailuat);
        return result;
    }
    @PostMapping("save")
    public void ínserLuatGt(@RequestBody LuatGt x) {
        luatGtService.save(x);
    }

    @DeleteMapping("delete")
    public void removeLuatGt(@RequestBody LuatGt x) {
        luatGtService.delete(x);
    }
}
