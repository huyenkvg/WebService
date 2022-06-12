package com.example.WebService.Services.Impl;

import com.example.WebService.Dto_Huyen.TaikhoanAdminDto;
import com.example.WebService.Entity_BLX.TaikhoanAdmin;
import com.example.WebService.Repositories_Mixed.TaikhoanAdminRepository;
import com.example.WebService.Services.TaiKhoanAdminService;
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
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class TaiKhoanAdminServiceImpl implements TaiKhoanAdminService {




    @Autowired
    private TaikhoanAdminRepository taikhoanAdminRepository;


    @Override
    public String maHoaMK(String mk) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(mk.getBytes());
        byte[] digest = md.digest();
        String newMK = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return newMK;
    }


    public List<TaikhoanAdmin> findAll() {
        return taikhoanAdminRepository.findAll();
    }

    public List<TaikhoanAdmin> findAll(Sort sort) {
        return taikhoanAdminRepository.findAll(sort);
    }

    public List<TaikhoanAdmin> findAllById(Iterable<String> strings) {
        return taikhoanAdminRepository.findAllById(strings);
    }

    public <S extends TaikhoanAdmin> List<S> saveAll(Iterable<S> entities) {
        return taikhoanAdminRepository.saveAll(entities);
    }

    public void flush() {
        taikhoanAdminRepository.flush();
    }

    public <S extends TaikhoanAdmin> S saveAndFlush(S entity) {
        return taikhoanAdminRepository.saveAndFlush(entity);
    }

    public <S extends TaikhoanAdmin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return taikhoanAdminRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<TaikhoanAdmin> entities) {
        taikhoanAdminRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<TaikhoanAdmin> entities) {
        taikhoanAdminRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<String> strings) {
        taikhoanAdminRepository.deleteAllByIdInBatch(strings);
    }

    public void deleteAllInBatch() {
        taikhoanAdminRepository.deleteAllInBatch();
    }

    @Deprecated
    public TaikhoanAdmin getOne(String s) {
        return taikhoanAdminRepository.getOne(s);
    }

    public TaikhoanAdmin getById(String s) {
        return taikhoanAdminRepository.getById(s);
    }

    public <S extends TaikhoanAdmin> List<S> findAll(Example<S> example) {
        return taikhoanAdminRepository.findAll(example);
    }

    public <S extends TaikhoanAdmin> List<S> findAll(Example<S> example, Sort sort) {
        return taikhoanAdminRepository.findAll(example, sort);
    }

    public Page<TaikhoanAdmin> findAll(Pageable pageable) {
        return taikhoanAdminRepository.findAll(pageable);
    }

    public <S extends TaikhoanAdmin> S save(S entity) {
        return taikhoanAdminRepository.save(entity);
    }

    public Optional<TaikhoanAdmin> findById(String s) {
        return taikhoanAdminRepository.findById(s);
    }

    public boolean existsById(String s) {
        return taikhoanAdminRepository.existsById(s);
    }

    public long count() {
        return taikhoanAdminRepository.count();
    }

    public void deleteById(String s) {
        taikhoanAdminRepository.deleteById(s);
    }

    public void delete(TaikhoanAdmin entity) {
        taikhoanAdminRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends String> strings) {
        taikhoanAdminRepository.deleteAllById(strings);
    }

    public void deleteAll(Iterable<? extends TaikhoanAdmin> entities) {
        taikhoanAdminRepository.deleteAll(entities);
    }

    public void deleteAll() {
        taikhoanAdminRepository.deleteAll();
    }

    public <S extends TaikhoanAdmin> Optional<S> findOne(Example<S> example) {
        return taikhoanAdminRepository.findOne(example);
    }

    public <S extends TaikhoanAdmin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return taikhoanAdminRepository.findAll(example, pageable);
    }

    public <S extends TaikhoanAdmin> long count(Example<S> example) {
        return taikhoanAdminRepository.count(example);
    }

    public <S extends TaikhoanAdmin> boolean exists(Example<S> example) {
        return taikhoanAdminRepository.exists(example);
    }

    public <S extends TaikhoanAdmin, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return taikhoanAdminRepository.findBy(example, queryFunction);
    }
}
