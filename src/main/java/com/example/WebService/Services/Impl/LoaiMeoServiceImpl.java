package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.LoaiMeoDTO;
import com.example.WebService.Dto_Huyen.LoaiMeoDto;
import com.example.WebService.Entity_BLX.LoaiMeo;
import com.example.WebService.Mapper.LoaimeoMapper;
import com.example.WebService.Repositories_Mixed.LoaiMeoRepository;
import com.example.WebService.Services.LoaiMeoService;
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
public class LoaiMeoServiceImpl implements LoaiMeoService {
    @Autowired
    private LoaiMeoRepository loaiMeoRepository;
    @Autowired
    private ModelMapper modelMapper;

    public LoaiMeoDto convertToDto(LoaiMeo ety) {

        LoaiMeoDto Dto = new LoaiMeoDto(ety.getMaLoaiMeo(),ety.getTenLoaiMeo());
        return Dto;
    }

    public List<LoaiMeoDto> findAll() {
        return loaiMeoRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<LoaiMeo> findAll(Sort sort) {
        return loaiMeoRepository.findAll(sort);
    }

    @Override
    public List<LoaiMeo> findAllById(Iterable<Integer> integers) {
        return loaiMeoRepository.findAllById(integers);
    }

    @Override
    public <S extends LoaiMeo> List<S> saveAll(Iterable<S> entities) {
        return loaiMeoRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        loaiMeoRepository.flush();
    }

    @Override
    public <S extends LoaiMeo> S saveAndFlush(S entity) {
        return loaiMeoRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends LoaiMeo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return loaiMeoRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<LoaiMeo> entities) {
        loaiMeoRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<LoaiMeo> entities) {
        loaiMeoRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        loaiMeoRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        loaiMeoRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public LoaiMeo getOne(Integer integer) {
        return loaiMeoRepository.getOne(integer);
    }

    @Override
    public LoaiMeo getById(Integer integer) {
        return loaiMeoRepository.getById(integer);
    }

    @Override
    public <S extends LoaiMeo> List<S> findAll(Example<S> example) {
        return loaiMeoRepository.findAll(example);
    }

    @Override
    public <S extends LoaiMeo> List<S> findAll(Example<S> example, Sort sort) {
        return loaiMeoRepository.findAll(example, sort);
    }

    @Override
    public Page<LoaiMeo> findAll(Pageable pageable) {
        return loaiMeoRepository.findAll(pageable);
    }

    @Override
    public <S extends LoaiMeo> S save(S entity) {
        return loaiMeoRepository.save(entity);
    }

    @Override
    public Optional<LoaiMeo> findById(Integer integer) {
        return loaiMeoRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return loaiMeoRepository.existsById(integer);
    }

    @Override
    public long count() {
        return loaiMeoRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        loaiMeoRepository.deleteById(integer);
    }

    @Override
    public void delete(LoaiMeo entity) {
        loaiMeoRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        loaiMeoRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends LoaiMeo> entities) {
        loaiMeoRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        loaiMeoRepository.deleteAll();
    }

    @Override
    public <S extends LoaiMeo> Optional<S> findOne(Example<S> example) {
        return loaiMeoRepository.findOne(example);
    }

    @Override
    public <S extends LoaiMeo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return loaiMeoRepository.findAll(example, pageable);
    }

    @Override
    public <S extends LoaiMeo> long count(Example<S> example) {
        return loaiMeoRepository.count(example);
    }

    @Override
    public <S extends LoaiMeo> boolean exists(Example<S> example) {
        return loaiMeoRepository.exists(example);
    }

    @Override
    public <S extends LoaiMeo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return loaiMeoRepository.findBy(example, queryFunction);
    }

    ///////////////////////// YENNNN//////////////////////////////
    @Override
    public List<LoaiMeoDTO> getListLoaimeo(){
        List<LoaiMeoDTO> result = new ArrayList<>();
        List<LoaiMeo> loaiMeos = loaiMeoRepository.findAll();
        for(LoaiMeo loaiMeo : loaiMeos){
            result.add(LoaimeoMapper.toLoaiMeoDTO(loaiMeo));
        }
        return result;
    }

}
