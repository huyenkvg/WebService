package com.example.WebService.Controller;

import com.example.WebService.Dto_Huyen.BodethiDto;
import com.example.WebService.Entity_BLX.Bodethi;
import com.example.WebService.DTO.BodethiDTO;
import com.example.WebService.DTO.CauhoiDTO;
import com.example.WebService.Services.BodethiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bodethi/")
public class BodethiController {
    @Autowired
    private BodethiService bodethiService;

    @GetMapping("getBodethi")
    public BodethiDTO getBode(@RequestParam(name="maloaibang") Integer maloaibang, @RequestParam(name="maloaide") Integer maloaide) {
        BodethiDTO bodethi = bodethiService.getBoDe(maloaibang,maloaide);
        return bodethi;
    }

    @GetMapping("get-all")
    public List<BodethiDto> getBodethi() {
        List<BodethiDto> list = bodethiService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserBodethi(@RequestBody Bodethi x) {
        bodethiService.save(x);
    }

    @DeleteMapping("delete")
    public void removeBodethi(@RequestBody Bodethi x) {
        bodethiService.delete(x);
    }

}
