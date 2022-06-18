package com.example.WebService.Services;

import java.util.ArrayList;
import java.util.List;

import com.example.WebService.DTO.CauhoiDTO;

public interface CauhoiService {

    List<CauhoiDTO> getListCauhoi();

    CauhoiDTO getCauhoiById(Integer id);

    List<CauhoiDTO> getCauHoiLT(Integer maBoDe, Integer maLoailt);

    List<CauhoiDTO> randCauHoi(Integer maBoDe);

    List<CauhoiDTO> getKQ_Cauhoi(String email,Integer luotthi, Integer mabode);

    List<CauhoiDTO> getCausai(String email, Integer maBoDe);

    // List<CauhoiDTO> randCauHoi2(Integer maBoDe);

}
