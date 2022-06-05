package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.KetquaDTO;
import com.example.WebService.Entity_BLX.Ketqua;
import com.example.WebService.Mapper.KetqauMapper;
import com.example.WebService.Repositories_Mixed.KetquaRepository;
import com.example.WebService.Services.KetquaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KetquaServicelmpl implements KetquaService {
    @Autowired
    private KetquaRepository ketquaRepository;

    @Override
    public List<KetquaDTO> getLuotThi(String email, Integer maLuotThi, Integer maBoDe) {
        List<Ketqua> ketquas = ketquaRepository.findAll();
        List<KetquaDTO> list = new ArrayList<>();
        for(Ketqua ketqua : ketquas){
            if((ketqua.getMauser().getEmail()).equals(email) && (ketqua.getLuotthi()==maLuotThi)
                    && (ketqua.getMacauhoi().getMaBoDe().getMabodethi()==maBoDe)){
                list.add(KetqauMapper.toKetquaDTO(ketqua));
            }
        }
        return list;
    }


    @Override
    public void saveKetqua(Ketqua ketqua){
        ketquaRepository.save(ketqua);
    }

    @Override
    public void deleteKetqua(Integer luotthi, String email){
        List<Ketqua> ketquas = ketquaRepository.findAll();
        for(Ketqua ketqua : ketquas){
            if(ketqua.getLuotthi()==luotthi && ketqua.getMauser().getEmail().equals(email)){
                ketquaRepository.delete(ketqua);
            }
        }
    }


    @Override
    public Integer getMaxLuotThi(String id, Integer mabode){
        List<Ketqua> ketquas = ketquaRepository.findAll();
        Integer max=0;
        for(Ketqua ketqua : ketquas){
            if((ketqua.getMauser().getEmail().trim().equals(id.trim())
                    && ketqua.getMacauhoi().getMaBoDe().getMabodethi()==mabode
                    && max < ketqua.getLuotthi())){
                max=ketqua.getLuotthi();
            }
        }
        return max;
    }

    @Override
    public List<Integer> getSTTLuotThi(String id, Integer mabode){
        List<Ketqua> ketquas = ketquaRepository.findAll();
        List<Integer> list = new ArrayList<>();
        Integer check =0;
        for(Ketqua ketqua : ketquas){
            if((ketqua.getMauser().getEmail().trim().equals(id.trim())
                    && ketqua.getMacauhoi().getMaBoDe().getMabodethi()==mabode)
                    && check != ketqua.getLuotthi()){

                check=ketqua.getLuotthi();
                list.add(check);
            }
        }
        return list;
    }



}
