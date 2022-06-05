package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.LoaibangDTO;
import com.example.WebService.Dto_Huyen.LoaibangDto;
import com.example.WebService.Entity_BLX.Loaibang;
import com.example.WebService.Mapper.LoaibangMapper;
import com.example.WebService.Repositories_Mixed.LoaibangRepository;
import com.example.WebService.Services.LoaibangService;
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
public class LoaibangServiceImpl implements LoaibangService {
     @Autowired
    private LoaibangRepository loaibangRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<LoaibangDto> findAll() {
        return loaibangRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Loaibang> findAll(Sort sort) {
        return loaibangRepository.findAll(sort);
    }

    @Override
    public List<Loaibang> findAllById(Iterable<Integer> integers) {
        return loaibangRepository.findAllById(integers);
    }

    @Override
    public <S extends Loaibang> List<S> saveAll(Iterable<S> entities) {
        return loaibangRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        loaibangRepository.flush();
    }

    @Override
    public <S extends Loaibang> S saveAndFlush(S entity) {
        return loaibangRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Loaibang> List<S> saveAllAndFlush(Iterable<S> entities) {
        return loaibangRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Loaibang> entities) {
        loaibangRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Loaibang> entities) {
        loaibangRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        loaibangRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        loaibangRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Loaibang getOne(Integer integer) {
        return loaibangRepository.getOne(integer);
    }

    @Override
    public Loaibang getById(Integer integer) {
        return loaibangRepository.getById(integer);
    }

    @Override
    public <S extends Loaibang> List<S> findAll(Example<S> example) {
        return loaibangRepository.findAll(example);
    }

    @Override
    public <S extends Loaibang> List<S> findAll(Example<S> example, Sort sort) {
        return loaibangRepository.findAll(example, sort);
    }

    @Override
    public Page<Loaibang> findAll(Pageable pageable) {
        return loaibangRepository.findAll(pageable);
    }

    @Override
    public <S extends Loaibang> S save(S entity) {
        return loaibangRepository.save(entity);
    }

    @Override
    public Optional<Loaibang> findById(Integer integer) {
        return loaibangRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return loaibangRepository.existsById(integer);
    }

    @Override
    public long count() {
        return loaibangRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        loaibangRepository.deleteById(integer);
    }

    @Override
    public void delete(Loaibang entity) {
        loaibangRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        loaibangRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends Loaibang> entities) {
        loaibangRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        loaibangRepository.deleteAll();
    }

    @Override
    public <S extends Loaibang> Optional<S> findOne(Example<S> example) {
        return loaibangRepository.findOne(example);
    }

    @Override
    public <S extends Loaibang> Page<S> findAll(Example<S> example, Pageable pageable) {
        return loaibangRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Loaibang> long count(Example<S> example) {
        return loaibangRepository.count(example);
    }

    @Override
    public <S extends Loaibang> boolean exists(Example<S> example) {
        return loaibangRepository.exists(example);
    }

    @Override
    public <S extends Loaibang, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return loaibangRepository.findBy(example, queryFunction);
    }
    public LoaibangDto convertToDto(Loaibang ety) {

        LoaibangDto Dto = new LoaibangDto(ety.getMaloaibang(), ety.getTenloaibang());
        return Dto;
    }

    //================ Nagn Yen =============================
    @Override
    public List<LoaibangDTO> getListLoaibang(){
        List<LoaibangDTO> result = new ArrayList<>();
        List<Loaibang> loaibangs = loaibangRepository.findAll();
        for(Loaibang loaibang : loaibangs){
            result.add(LoaibangMapper.toLoaibangDTO(loaibang));
        }
        return result;
    }
}
