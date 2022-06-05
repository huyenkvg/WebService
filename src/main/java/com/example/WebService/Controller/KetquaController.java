package com.example.WebService.Controller;

import com.example.WebService.Entity_BLX.Ketqua;
import com.example.WebService.DTO.KetquaDTO;
import com.example.WebService.Services.KetquaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/ketqua/")
public class KetquaController {
    @Autowired
    KetquaService ketquaService;

    @GetMapping("getLuotThi")
    public List<KetquaDTO> getLuotThi(@RequestParam(name="email") String email, @RequestParam(name="luotthi") Integer luotthi, @RequestParam(name="mabode") Integer maBoDe) {
        List<KetquaDTO> list = ketquaService.getLuotThi(email,luotthi,maBoDe);
        return list;
    }


    @PostMapping("insertKetqua")
    public Ketqua insertKetqua(@RequestBody Ketqua ketqua){
        ketquaService.saveKetqua(ketqua);
        return ketqua;
    }


    @GetMapping("max")
    public Integer getMaxluotthi(@RequestParam("id") String id, @RequestParam("mabode") Integer mabode) {
        Integer max = ketquaService.getMaxLuotThi(id,mabode);
        return max;
    }

    @GetMapping("getSTT")
    public List<Integer> getSTT(@RequestParam("email") String email, @RequestParam("mabode") Integer mabode) {
        List<Integer> list = ketquaService.getSTTLuotThi(email,mabode);
        return list;
    }


    @GetMapping("deleteKQ")
    public void deleteKQ(@RequestParam(name="luotthi") Integer luotthi, @RequestParam(name="email") String email){
        ketquaService.deleteKetqua(luotthi,email);
    }


}
