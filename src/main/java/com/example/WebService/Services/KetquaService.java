package com.example.WebService.Services;

import com.example.WebService.DTO.KetquaDTO;
import com.example.WebService.Entity_BLX.Ketqua;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KetquaService {
    List<KetquaDTO> getLuotThi(String email, Integer maLuotThi,Integer maBoDe);


    void saveKetqua(Ketqua ketqua);

    void deleteKetqua(Integer luotthi, String email);

    Integer getMaxLuotThi(String id, Integer mabode);

    List<Integer> getSTTLuotThi(String id, Integer mabode);
}

