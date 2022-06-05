package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.CauhoiDTO;
import com.example.WebService.Dto_Huyen.CauhoiDto;
import com.example.WebService.Entity_BLX.Cauhoi;
import com.example.WebService.Entity_BLX.Ketqua;
import com.example.WebService.Mapper.CauhoiMapper;
import com.example.WebService.Repositories_Mixed.CauhoiRepository;
import com.example.WebService.Repositories_Mixed.KetquaRepository;
import com.example.WebService.Services.CauhoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CauhoiServiceImpl implements CauhoiService {
    @Autowired
    private CauhoiRepository cauhoiRepository;
    @Autowired
    private KetquaRepository ketquaRepository;

    public CauhoiDto convertToDto(Cauhoi ety) {

       CauhoiDto Dto = new CauhoiDto(ety.getMacauhoi(), ety.getNoidung(),ety.getA(), ety.getB(), ety.getC(),  ety.getD(), ety.getDapan(), ety.getHinhAnh(),  ety.getMaBoDe().getMabodethi(), ety.getMaLoaiLiThuyet().getMaLoaiLiThuyet());
        return Dto;
    }
    public List<CauhoiDto> findAll() {
        return cauhoiRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<Cauhoi> findAll(Sort sort) {
        return cauhoiRepository.findAll(sort);
    }

    public List<Cauhoi> findAllById(Iterable<Integer> integers) {
        return cauhoiRepository.findAllById(integers);
    }

    public <S extends Cauhoi> List<S> saveAll(Iterable<S> entities) {
        return cauhoiRepository.saveAll(entities);
    }

    public void flush() {
        cauhoiRepository.flush();
    }

    public <S extends Cauhoi> S saveAndFlush(S entity) {
        return cauhoiRepository.saveAndFlush(entity);
    }

    public <S extends Cauhoi> List<S> saveAllAndFlush(Iterable<S> entities) {
        return cauhoiRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Cauhoi> entities) {
        cauhoiRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Cauhoi> entities) {
        cauhoiRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        cauhoiRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        cauhoiRepository.deleteAllInBatch();
    }

    @Deprecated
    public Cauhoi getOne(Integer integer) {
        return cauhoiRepository.getOne(integer);
    }

    public Cauhoi getById(Integer integer) {
        return cauhoiRepository.getById(integer);
    }

    public <S extends Cauhoi> List<S> findAll(Example<S> example) {
        return cauhoiRepository.findAll(example);
    }

    public <S extends Cauhoi> List<S> findAll(Example<S> example, Sort sort) {
        return cauhoiRepository.findAll(example, sort);
    }

    public Page<Cauhoi> findAll(Pageable pageable) {
        return cauhoiRepository.findAll(pageable);
    }

    public <S extends Cauhoi> S save(S entity) {
        return cauhoiRepository.save(entity);
    }

    public Optional<Cauhoi> findById(Integer integer) {
        return cauhoiRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return cauhoiRepository.existsById(integer);
    }

    public long count() {
        return cauhoiRepository.count();
    }

    public void deleteById(Integer integer) {
        cauhoiRepository.deleteById(integer);
    }

    public void delete(Cauhoi entity) {
        cauhoiRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        cauhoiRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Cauhoi> entities) {
        cauhoiRepository.deleteAll(entities);
    }

    public void deleteAll() {
        cauhoiRepository.deleteAll();
    }

    public <S extends Cauhoi> Optional<S> findOne(Example<S> example) {
        return cauhoiRepository.findOne(example);
    }

    public <S extends Cauhoi> Page<S> findAll(Example<S> example, Pageable pageable) {
        return cauhoiRepository.findAll(example, pageable);
    }

    public <S extends Cauhoi> long count(Example<S> example) {
        return cauhoiRepository.count(example);
    }

    public <S extends Cauhoi> boolean exists(Example<S> example) {
        return cauhoiRepository.exists(example);
    }

    public <S extends Cauhoi, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return cauhoiRepository.findBy(example, queryFunction);
    }

    ///////////////===============NGAN YEN//////////

    @Override
    public List<CauhoiDTO> getListCauhoi(){
        List<CauhoiDTO> result = new ArrayList<CauhoiDTO>();
        List<Cauhoi> cauhois = cauhoiRepository.findAll();
        for(Cauhoi cauhoi : cauhois){
            result.add(CauhoiMapper.toCauhoiDTO(cauhoi));
        }
        return result;
    }

    @Override
    public CauhoiDTO getCauhoiById(Integer id) {
        List<Cauhoi> cauhois = cauhoiRepository.findAll();
        for(Cauhoi cauhoi : cauhois){
            if(cauhoi.getMacauhoi().equals(id)){
                return CauhoiMapper.toCauhoiDTO(cauhoi);
            }
        }
        return null;
    }

    @Override
    public List<CauhoiDTO> getCauHoiLT(Integer maBoDe, Integer maLoailt) {
        List<Cauhoi> cauhois = cauhoiRepository.findAll();
        List<CauhoiDTO> list = new ArrayList<>();
        for(Cauhoi cauhoi : cauhois){
            if((cauhoi.getMaBoDe().getMabodethi())==maBoDe && (cauhoi.getMaLoaiLiThuyet().getMaLoaiLiThuyet())==maLoailt){
                list.add(CauhoiMapper.toCauhoiDTO(cauhoi));
            }
        }
        return list;
    }

    @Override
    public List<CauhoiDTO> randCauHoi(Integer maBoDe) {
        List<Cauhoi> cauhois = cauhoiRepository.findCauHoi();
        List<CauhoiDTO> list = new ArrayList<>();
        for(Cauhoi cauhoi : cauhois){
            if(cauhoi.getMaBoDe().getMabodethi()==maBoDe) {
                list.add(CauhoiMapper.toCauhoiDTO(cauhoi));
            }
        }
        return list;
    }

    @Override
    public List<CauhoiDTO> getKQ_Cauhoi(String email, Integer luotthi, Integer maBoDe) {
        List<Cauhoi> cauhois = cauhoiRepository.getKQ_Cauhoi(email,luotthi,maBoDe);
        List<CauhoiDTO> list = new ArrayList<>();
        for(Cauhoi cauhoi : cauhois){
            list.add(CauhoiMapper.toCauhoiDTO(cauhoi));
        }
        return list;
    }

    @Override
    public List<CauhoiDTO> getCausai(String email, Integer maBoDe){
        List<Cauhoi> cauhois = cauhoiRepository.getCauHoi(email,maBoDe);
        List<CauhoiDTO> list = new ArrayList<>();
        List<Ketqua> ketquas = ketquaRepository.findAll();
        for(int i =0;i< cauhois.size();i++){
            if(!(cauhois.get(i).getDapan().trim().equals(ketquas.get(i).getPhuongan().trim())))
                list.add(CauhoiMapper.toCauhoiDTO(cauhois.get(i)));
        }
        return list;
    }

}
