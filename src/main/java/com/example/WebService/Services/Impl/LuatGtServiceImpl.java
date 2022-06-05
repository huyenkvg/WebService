package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.LuatDTO;
import com.example.WebService.Dto_Huyen.LuatGtDto;
import com.example.WebService.Entity_BLX.LuatGt;
import com.example.WebService.Mapper.LuatMapper;
import com.example.WebService.Repositories_Mixed.LuatGtRepository;
import com.example.WebService.Services.LuatGtService;
import org.modelmapper.ModelMapper;
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
public class LuatGtServiceImpl implements LuatGtService {
    @Autowired
    private LuatGtRepository luatGtRepository;
    @Autowired
    private ModelMapper modelMapper;

    public LuatGtDto convertToDto(LuatGt ety) {

        LuatGtDto Dto = new LuatGtDto(ety.getMaluat(), ety.getNoidung(), ety.getMucphat());
        return Dto;
    }

    @Override
    public List<LuatGtDto> findAll() {
        return luatGtRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<LuatGt> findAll(Sort sort) {
        return luatGtRepository.findAll(sort);
    }

    @Override
    public List<LuatGt> findAllById(Iterable<String> strings) {
        return luatGtRepository.findAllById(strings);
    }

    @Override
    public <S extends LuatGt> List<S> saveAll(Iterable<S> entities) {
        return luatGtRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        luatGtRepository.flush();
    }

    @Override
    public <S extends LuatGt> S saveAndFlush(S entity) {
        return luatGtRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends LuatGt> List<S> saveAllAndFlush(Iterable<S> entities) {
        return luatGtRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<LuatGt> entities) {
        luatGtRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<LuatGt> entities) {
        luatGtRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {
        luatGtRepository.deleteAllByIdInBatch(strings);
    }

    @Override
    public void deleteAllInBatch() {
        luatGtRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public LuatGt getOne(String s) {
        return luatGtRepository.getOne(s);
    }

    @Override
    public LuatGt getById(String s) {
        return luatGtRepository.getById(s);
    }

    @Override
    public <S extends LuatGt> List<S> findAll(Example<S> example) {
        return luatGtRepository.findAll(example);
    }

    @Override
    public <S extends LuatGt> List<S> findAll(Example<S> example, Sort sort) {
        return luatGtRepository.findAll(example, sort);
    }

    @Override
    public Page<LuatGt> findAll(Pageable pageable) {
        return luatGtRepository.findAll(pageable);
    }

    @Override
    public <S extends LuatGt> S save(S entity) {
        return luatGtRepository.save(entity);
    }

    @Override
    public Optional<LuatGt> findById(String s) {
        return luatGtRepository.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return luatGtRepository.existsById(s);
    }

    @Override
    public long count() {
        return luatGtRepository.count();
    }

    @Override
    public void deleteById(String s) {
        luatGtRepository.deleteById(s);
    }

    @Override
    public void delete(LuatGt entity) {
        luatGtRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        luatGtRepository.deleteAllById(strings);
    }

    @Override
    public void deleteAll(Iterable<? extends LuatGt> entities) {
        luatGtRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        luatGtRepository.deleteAll();
    }

    @Override
    public <S extends LuatGt> Optional<S> findOne(Example<S> example) {
        return luatGtRepository.findOne(example);
    }

    @Override
    public <S extends LuatGt> Page<S> findAll(Example<S> example, Pageable pageable) {
        return luatGtRepository.findAll(example, pageable);
    }

    @Override
    public <S extends LuatGt> long count(Example<S> example) {
        return luatGtRepository.count(example);
    }

    @Override
    public <S extends LuatGt> boolean exists(Example<S> example) {
        return luatGtRepository.exists(example);
    }

    @Override
    public <S extends LuatGt, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return luatGtRepository.findBy(example, queryFunction);
    }

    @Override
    public List<LuatDTO> getLuatByLoaiLuat(Integer maLoailuat){
        List<LuatGt> luatGts = luatGtRepository.findAll();
        List<LuatDTO> list = new ArrayList<>();
        for(LuatGt luatGt : luatGts){
            if(luatGt.getMaLoaiLuatGt().getMaLoaiLuatGt() == maLoailuat){
                list.add(LuatMapper.toLuatDTO(luatGt));
            }
        }
        return list;
    }
}
