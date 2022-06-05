package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.TaikhoanDTO;
import com.example.WebService.Dto_Huyen.TaikhoanDto;
import com.example.WebService.Entity_BLX.Taikhoan;
import com.example.WebService.Mapper.TaikhoanMapper;
import com.example.WebService.Repositories_Mixed.TaikhoanRepository;
import com.example.WebService.Services.TaiKhoanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;


import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    private TaikhoanRepository taikhoanRepository;
    @Autowired
    private ModelMapper modelMapper;



    @Override
    public List<TaikhoanDTO> getListTaiKhoan(){
        List<TaikhoanDTO> result = new ArrayList<>();
        List<Taikhoan> taikhoans = taikhoanRepository.findAll();
        for(Taikhoan tk : taikhoans){
            result.add(TaikhoanMapper.toTaikhoanDTO(tk));
        }
        return result;
    }

    @Override
    public TaikhoanDTO getTKById(String id){
        List<Taikhoan> taikhoans = taikhoanRepository.findAll();
        for(Taikhoan tk : taikhoans){
            if(tk.getTendangnhap().equals(id)){
                return TaikhoanMapper.toTaikhoanDTO(tk);
            }
        }
        return null;
    }

    @Override
    public String maHoaMK(String mk) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(mk.getBytes());
        byte[] digest = md.digest();
        String newMK = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return newMK;
    }

    @Override
    public Boolean checkDangNhap(TaikhoanDTO taikhoanDTO, String tk, String mk){
        System.out.println("tk: "+taikhoanDTO.getTendangnhap());
        System.out.println("mk: "+taikhoanDTO.getMatkhau());
        System.out.println("mk2: "+mk);
        if(taikhoanDTO.getTendangnhap().trim().equals(tk) &&
                taikhoanDTO.getMatkhau().trim().equals(mk)){
            return true;
        }
        else return false;
    }






    //=========================HUYEN=========================================

    public TaikhoanDto convertToDto(Taikhoan ety) {

        TaikhoanDto Dto = new TaikhoanDto(ety.getTendangnhap(), ety.getMatkhau(), ety.getTrangthai(),ety.getUser().getEmail());
        return Dto;
    }
    public List<TaikhoanDto> findAll() {
        return taikhoanRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<Taikhoan> findAll(Sort sort) {
        return taikhoanRepository.findAll(sort);
    }

    public List<Taikhoan> findAllById(Iterable<String> strings) {
        return taikhoanRepository.findAllById(strings);
    }

    public <S extends Taikhoan> List<S> saveAll(Iterable<S> entities) {
        return taikhoanRepository.saveAll(entities);
    }

    public void flush() {
        taikhoanRepository.flush();
    }

    public <S extends Taikhoan> S saveAndFlush(S entity) {
        return taikhoanRepository.saveAndFlush(entity);
    }

    public <S extends Taikhoan> List<S> saveAllAndFlush(Iterable<S> entities) {
        return taikhoanRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Taikhoan> entities) {
        taikhoanRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Taikhoan> entities) {
        taikhoanRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<String> strings) {
        taikhoanRepository.deleteAllByIdInBatch(strings);
    }

    public void deleteAllInBatch() {
        taikhoanRepository.deleteAllInBatch();
    }

    @Deprecated
    public Taikhoan getOne(String s) {
        return taikhoanRepository.getOne(s);
    }

    public Taikhoan getById(String s) {
        return taikhoanRepository.getById(s);
    }

    public <S extends Taikhoan> List<S> findAll(Example<S> example) {
        return taikhoanRepository.findAll(example);
    }

    public <S extends Taikhoan> List<S> findAll(Example<S> example, Sort sort) {
        return taikhoanRepository.findAll(example, sort);
    }

    public Page<Taikhoan> findAll(Pageable pageable) {
        return taikhoanRepository.findAll(pageable);
    }

    public <S extends Taikhoan> S save(S entity) {
        return taikhoanRepository.save(entity);
    }

    public Optional<Taikhoan> findById(String s) {
        return taikhoanRepository.findById(s);
    }

    public boolean existsById(String s) {
        return taikhoanRepository.existsById(s);
    }

    public long count() {
        return taikhoanRepository.count();
    }

    public void deleteById(String s) {
        taikhoanRepository.deleteById(s);
    }

    public void delete(Taikhoan entity) {
        taikhoanRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends String> strings) {
        taikhoanRepository.deleteAllById(strings);
    }

    public void deleteAll(Iterable<? extends Taikhoan> entities) {
        taikhoanRepository.deleteAll(entities);
    }

    public void deleteAll() {
        taikhoanRepository.deleteAll();
    }

    public <S extends Taikhoan> Optional<S> findOne(Example<S> example) {
        return taikhoanRepository.findOne(example);
    }

    public <S extends Taikhoan> Page<S> findAll(Example<S> example, Pageable pageable) {
        return taikhoanRepository.findAll(example, pageable);
    }

    public <S extends Taikhoan> long count(Example<S> example) {
        return taikhoanRepository.count(example);
    }

    public <S extends Taikhoan> boolean exists(Example<S> example) {
        return taikhoanRepository.exists(example);
    }

    public <S extends Taikhoan, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return taikhoanRepository.findBy(example, queryFunction);
    }
}
