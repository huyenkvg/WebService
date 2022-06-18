package com.example.WebService.Controller;

import com.example.WebService.Dto_Huyen.CauhoiDto;
import com.example.WebService.Entity_BLX.Bodethi;
import com.example.WebService.Entity_BLX.Cauhoi;
import com.example.WebService.DTO.CauhoiDTO;
import com.example.WebService.Services.Impl.CauhoiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/cauhoi/")
public class CauhoiController {
    @Autowired
    private CauhoiServiceImpl cauhoiService;

    @GetMapping("get")
    public List<CauhoiDTO> getCauhoi() {
        List<CauhoiDTO> list = cauhoiService.getListCauhoi();
        return list;
    }

    @GetMapping("{id}")
    public CauhoiDTO getCauhoiById(@PathVariable Integer id){
        System.out.println("id: "+id);
        CauhoiDTO cauhoi = cauhoiService.getCauhoiById(id);
        return cauhoi;
    }

    @GetMapping("getCauhoiLT")
    public List<CauhoiDTO> getCauhoiLT(@RequestParam(name="mabode") Integer maBoDe, @RequestParam(name="maloailt") Integer maLoailt) {
        List<CauhoiDTO> list = cauhoiService.getCauHoiLT(maBoDe,maLoailt);
        return list;
    }

    @GetMapping("randDeThi")
    public List<CauhoiDTO> randDeThi(@RequestParam(name="mabode") Integer maBoDe) {
        List<CauhoiDTO> list = cauhoiService.randCauHoi(maBoDe);
        List<CauhoiDTO> deThi = new ArrayList<CauhoiDTO>();
        for(int i =0; i<10;i++){
            deThi.add(list.get(i));
        }
        return deThi;
    }

    @GetMapping("getkqch")
    public List<CauhoiDTO> getKQ_Cauhoi(@RequestParam(name="email") String email,@RequestParam(name="luotthi") Integer luotthi, @RequestParam(name="mabode") Integer mabode) {
        List<CauhoiDTO> list = cauhoiService.getKQ_Cauhoi(email,luotthi,mabode);
        return list;
    }

    @GetMapping("getcausai")
    public List<CauhoiDTO> getCausai(@RequestParam(name="email") String email,@RequestParam(name="mabode") Integer mabode) {
        List<CauhoiDTO> list = cauhoiService.getCausai(email,mabode);
        return list;
    }


    @GetMapping("get-all")
    public List<CauhoiDto> getCauhoiTest() {
        List<CauhoiDto> list = cauhoiService.findAll();
        return list;
    }
    @GetMapping("get-rand")
    public List<CauhoiDTO> randomDeThi(@RequestParam(name="mabode") Integer maBoDe) {
        List<CauhoiDTO> list = cauhoiService.layBoDe(maBoDe);
        List<CauhoiDTO> myrand = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random generator = new Random();
            int randomIndex = generator.nextInt(list.toArray().length);

            myrand.add(list.get(randomIndex));
            list.remove(randomIndex);
        }
        return myrand;
    }
    @PostMapping("save")
    public void ínserCauHoi(@RequestBody Cauhoi x) {
        cauhoiService.save(x);
    }

    @DeleteMapping("delete")
    public void removeCauhoi(@RequestBody Cauhoi x) {
        cauhoiService.delete(x);
    }


    @DeleteMapping("xoa-cauhoi")
    public String xoaByMaCauhoi(@RequestParam (name="macauhoi") String x) {
        CauhoiDTO ch =getCauhoiById(Integer.parseInt(x));
        cauhoiService.deleteCauHoiById(x);
        if(ch == null)
        {
            return "ma cau hoi khong ton tai";
        }
        return "xoa thanh cong "+ch.getMacauhoi();
    }

    @GetMapping("get-lythuyet")
    public int getCauhoiLyThuyet(@RequestParam (name="maloailythuyet") String x) {
        return cauhoiService.getSLCauhoiTheoLyThuyet(x);
    }



}
