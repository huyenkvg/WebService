package com.example.WebService.Controller;

import com.example.WebService.DTO.LoailithuyetDTO;
import com.example.WebService.Entity_BLX.Cauhoi;
import com.example.WebService.Entity_BLX.Loailithuyet;
import com.example.WebService.Services.LoailithuyetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loailt/")
public class LoailithuyetController {
    @Autowired
    private LoailithuyetService loailithuyetService;

    @GetMapping("get")
    public List<LoailithuyetDTO> getLoailt(){
        List<LoailithuyetDTO> loailt = loailithuyetService.getListLoailt();
        return loailt;
    }

    @GetMapping("{id}")
    public LoailithuyetDTO getLoailtById(@PathVariable Integer id){
        LoailithuyetDTO loailt = loailithuyetService.getLoailtByID(id);
        return loailt;
    }
    @PostMapping("save")
    public void ínserLoailithuyet(@RequestBody Loailithuyet x) {
        loailithuyetService.save(x);
    }

    @DeleteMapping("delete")
    public void removeLoailithuyet(@RequestBody Loailithuyet x) {
        loailithuyetService.delete(x);
    }
}
