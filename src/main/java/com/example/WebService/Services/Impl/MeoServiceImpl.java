package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.MeoDTO;
import com.example.WebService.Dto_Huyen.MeoDto;
import com.example.WebService.Entity_BLX.Meo;
import com.example.WebService.Mapper.MeoMapper;
import com.example.WebService.Repositories_Mixed.MeoRepository;
import com.example.WebService.Services.MeoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class MeoServiceImpl implements MeoService {
    @Autowired
    private MeoRepository meoRepository;
    @Autowired
    private ModelMapper modelMapper;

    public MeoDto convertToDto(Meo ety) {

        MeoDto Dto = new MeoDto(ety.getMaMeo(), ety.getNoidung());
        return Dto;
    }
    public List<MeoDto> findAll() {
        return meoRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<Meo> findAll(Sort sort) {
        return meoRepository.findAll(sort);
    }

    public List<Meo> findAllById(Iterable<Integer> integers) {
        return meoRepository.findAllById(integers);
    }

    public <S extends Meo> List<S> saveAll(Iterable<S> entities) {
        return meoRepository.saveAll(entities);
    }

    public void flush() {
        meoRepository.flush();
    }

    public <S extends Meo> S saveAndFlush(S entity) {
        return meoRepository.saveAndFlush(entity);
    }

    public <S extends Meo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return meoRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Meo> entities) {
        meoRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Meo> entities) {
        meoRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        meoRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        meoRepository.deleteAllInBatch();
    }

    @Deprecated
    public Meo getOne(Integer integer) {
        return meoRepository.getOne(integer);
    }

    public Meo getById(Integer integer) {
        return meoRepository.getById(integer);
    }

    public <S extends Meo> List<S> findAll(Example<S> example) {
        return meoRepository.findAll(example);
    }

    public <S extends Meo> List<S> findAll(Example<S> example, Sort sort) {
        return meoRepository.findAll(example, sort);
    }

    public Page<Meo> findAll(Pageable pageable) {
        return meoRepository.findAll(pageable);
    }

    public <S extends Meo> S save(S entity) {
        return meoRepository.save(entity);
    }

    public Optional<Meo> findById(Integer integer) {
        return meoRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return meoRepository.existsById(integer);
    }

    public long count() {
        return meoRepository.count();
    }

    public void deleteById(Integer integer) {
        meoRepository.deleteById(integer);
    }

    public void delete(Meo entity) {
        meoRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        meoRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Meo> entities) {
        meoRepository.deleteAll(entities);
    }

    public void deleteAll() {
        meoRepository.deleteAll();
    }

    public <S extends Meo> Optional<S> findOne(Example<S> example) {
        return meoRepository.findOne(example);
    }

    public <S extends Meo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return meoRepository.findAll(example, pageable);
    }

    public <S extends Meo> long count(Example<S> example) {
        return meoRepository.count(example);
    }

    public <S extends Meo> boolean exists(Example<S> example) {
        return meoRepository.exists(example);
    }

    public <S extends Meo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return meoRepository.findBy(example, queryFunction);
    }

    //=================
    @Override
    public MeoDTO getMeoByLoaiMeo(Integer maLoaiMeo){
        List<Meo> Meos = meoRepository.findAll();
        for(Meo meo : Meos){
            if(meo.getMaLoaiMeo().getMaLoaiMeo() == maLoaiMeo){
                return MeoMapper.toLoaiMeoDTO(meo);
            }
        }
        return null;
    }
}
