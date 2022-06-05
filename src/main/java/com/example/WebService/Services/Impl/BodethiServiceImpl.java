package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.BodethiDTO;
import com.example.WebService.Dto_Huyen.BodethiDto;
import com.example.WebService.Entity_BLX.Bodethi;
import com.example.WebService.Mapper.BodethiMapper;
import com.example.WebService.Repositories_Mixed.BodethiRepository;
import com.example.WebService.Services.BodethiService;
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
public class BodethiServiceImpl implements BodethiService {
@Autowired
   private BodethiRepository bodethiRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public BodethiDTO getBoDe(Integer maLoaibang, Integer maLoaide) {
        List<Bodethi> bodethis = bodethiRepository.findAll();
        for(Bodethi bodethi : bodethis){
            if((bodethi.getMaloaibang().getMaloaibang())==maLoaibang && (bodethi.getMaloaide().getMaloaide())==maLoaide){
                return BodethiMapper.toBodethiDTO(bodethi);
            }
        }
        return null;
    }
    //=========================================HUYEN

    @Override
    public List<BodethiDto> findAll() {
        return (List<BodethiDto>) bodethiRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Bodethi> findAll(Sort sort) {
        return bodethiRepository.findAll(sort);
    }

    @Override
    public List<Bodethi> findAllById(Iterable<Integer> integers) {
        return bodethiRepository.findAllById(integers);
    }

    @Override
    public <S extends Bodethi> List<S> saveAll(Iterable<S> entities) {
        return bodethiRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        bodethiRepository.flush();
    }

    @Override
    public <S extends Bodethi> S saveAndFlush(S entity) {
        return bodethiRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Bodethi> List<S> saveAllAndFlush(Iterable<S> entities) {
        return bodethiRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Bodethi> entities) {
        bodethiRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Bodethi> entities) {
        bodethiRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        bodethiRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        bodethiRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Bodethi getOne(Integer integer) {
        return bodethiRepository.getOne(integer);
    }

    @Override
    public Bodethi getById(Integer integer) {
        return bodethiRepository.getById(integer);
    }

    @Override
    public <S extends Bodethi> List<S> findAll(Example<S> example) {
        return bodethiRepository.findAll(example);
    }

    @Override
    public <S extends Bodethi> List<S> findAll(Example<S> example, Sort sort) {
        return bodethiRepository.findAll(example, sort);
    }

    @Override
    public Page<Bodethi> findAll(Pageable pageable) {
        return bodethiRepository.findAll(pageable);
    }

    @Override
    public <S extends Bodethi> S save(S entity) {
        return bodethiRepository.save(entity);
    }

    @Override
    public Optional<Bodethi> findById(Integer integer) {
        return bodethiRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return bodethiRepository.existsById(integer);
    }

    @Override
    public long count() {
        return bodethiRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        bodethiRepository.deleteById(integer);
    }

    @Override
    public void delete(Bodethi entity) {
        bodethiRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        bodethiRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends Bodethi> entities) {
        bodethiRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        bodethiRepository.deleteAll();
    }

    @Override
    public <S extends Bodethi> Optional<S> findOne(Example<S> example) {
        return bodethiRepository.findOne(example);
    }

    @Override
    public <S extends Bodethi> Page<S> findAll(Example<S> example, Pageable pageable) {
        return bodethiRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Bodethi> long count(Example<S> example) {
        return bodethiRepository.count(example);
    }

    @Override
    public <S extends Bodethi> boolean exists(Example<S> example) {
        return bodethiRepository.exists(example);
    }

    @Override
    public <S extends Bodethi, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return bodethiRepository.findBy(example, queryFunction);
    }

    @Override
    public BodethiDto convertToDto(Bodethi ety) {

        BodethiDto Dto = new BodethiDto(ety.getMabodethi(),ety.getMaloaibang().getMaloaibang(), ety.getMaloaide().getMaloaide());
        return Dto;
    }

}
