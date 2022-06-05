package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.LoaiLuatDTO;
import com.example.WebService.Dto_Huyen.LoaiLuatGtDto;
import com.example.WebService.Entity_BLX.LoaiLuatGt;
import com.example.WebService.Mapper.LoailuatMapper;
import com.example.WebService.Repositories_Mixed.LoaiLuatGtRepository;
import com.example.WebService.Services.LoaiLuatGtService;
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
public class LoaiLuatGtServiceImpl implements LoaiLuatGtService {
    @Autowired
    private LoaiLuatGtRepository loaiLuatGtRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<LoaiLuatDTO> getListLoailuat(){
        List<LoaiLuatDTO> result = new ArrayList<>();
        List<LoaiLuatGt> loaiLuatGts = loaiLuatGtRepository.findAll();
        for(LoaiLuatGt loaiLuatGt : loaiLuatGts){
            result.add(LoailuatMapper.toLoailuatDTO(loaiLuatGt));
        }
        return result;
    }
    //======================HUYEN=================

    public LoaiLuatGtDto convertToDto(LoaiLuatGt ety) {

        LoaiLuatGtDto Dto = new LoaiLuatGtDto(ety.getMaLoaiLuatGt(), ety.getTenLoaiLuatGt());
        return Dto;
    }
    @Override
    public List<LoaiLuatGtDto> findAll() {
        return loaiLuatGtRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<LoaiLuatGt> findAll(Sort sort) {
        return loaiLuatGtRepository.findAll(sort);
    }

    @Override
    public List<LoaiLuatGt> findAllById(Iterable<Integer> integers) {
        return loaiLuatGtRepository.findAllById(integers);
    }

    @Override
    public <S extends LoaiLuatGt> List<S> saveAll(Iterable<S> entities) {
        return loaiLuatGtRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        loaiLuatGtRepository.flush();
    }

    @Override
    public <S extends LoaiLuatGt> S saveAndFlush(S entity) {
        return loaiLuatGtRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends LoaiLuatGt> List<S> saveAllAndFlush(Iterable<S> entities) {
        return loaiLuatGtRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<LoaiLuatGt> entities) {
        loaiLuatGtRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<LoaiLuatGt> entities) {
        loaiLuatGtRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        loaiLuatGtRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        loaiLuatGtRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public LoaiLuatGt getOne(Integer integer) {
        return loaiLuatGtRepository.getOne(integer);
    }

    @Override
    public LoaiLuatGt getById(Integer integer) {
        return loaiLuatGtRepository.getById(integer);
    }

    @Override
    public <S extends LoaiLuatGt> List<S> findAll(Example<S> example) {
        return loaiLuatGtRepository.findAll(example);
    }

    @Override
    public <S extends LoaiLuatGt> List<S> findAll(Example<S> example, Sort sort) {
        return loaiLuatGtRepository.findAll(example, sort);
    }

    @Override
    public Page<LoaiLuatGt> findAll(Pageable pageable) {
        return loaiLuatGtRepository.findAll(pageable);
    }

    @Override
    public <S extends LoaiLuatGt> S save(S entity) {
        return loaiLuatGtRepository.save(entity);
    }

    @Override
    public Optional<LoaiLuatGt> findById(Integer integer) {
        return loaiLuatGtRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return loaiLuatGtRepository.existsById(integer);
    }

    @Override
    public long count() {
        return loaiLuatGtRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        loaiLuatGtRepository.deleteById(integer);
    }

    @Override
    public void delete(LoaiLuatGt entity) {
        loaiLuatGtRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        loaiLuatGtRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends LoaiLuatGt> entities) {
        loaiLuatGtRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        loaiLuatGtRepository.deleteAll();
    }

    @Override
    public <S extends LoaiLuatGt> Optional<S> findOne(Example<S> example) {
        return loaiLuatGtRepository.findOne(example);
    }

    @Override
    public <S extends LoaiLuatGt> Page<S> findAll(Example<S> example, Pageable pageable) {
        return loaiLuatGtRepository.findAll(example, pageable);
    }

    @Override
    public <S extends LoaiLuatGt> long count(Example<S> example) {
        return loaiLuatGtRepository.count(example);
    }

    @Override
    public <S extends LoaiLuatGt> boolean exists(Example<S> example) {
        return loaiLuatGtRepository.exists(example);
    }

    @Override
    public <S extends LoaiLuatGt, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return loaiLuatGtRepository.findBy(example, queryFunction);
    }
}
