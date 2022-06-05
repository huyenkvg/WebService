package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.LoaideDTO;
import com.example.WebService.Dto_Huyen.LoaideDto;
import com.example.WebService.Entity_BLX.Loaide;
import com.example.WebService.Mapper.LoaideMapper;
import com.example.WebService.Repositories_Mixed.LoaideRepository;
import com.example.WebService.Services.LoaideService;
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
public class LoaideServiceImpl implements LoaideService {
    @Autowired
    private LoaideRepository loaideRepository;

    @Autowired
    private ModelMapper modelMapper;

    public LoaideDto convertToDto(Loaide ety) {

        LoaideDto Dto = new LoaideDto(ety.getMaloaide(), ety.getTenloaide(), ety.getSocau(), ety.getThoigian());
        return Dto;
    }
    
    @Override
    public List<LoaideDto> findAll() {
        return loaideRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Loaide> findAll(Sort sort) {
        return loaideRepository.findAll(sort);
    }

    @Override
    public List<Loaide> findAllById(Iterable<Integer> integers) {
        return loaideRepository.findAllById(integers);
    }

    @Override
    public <S extends Loaide> List<S> saveAll(Iterable<S> entities) {
        return loaideRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        loaideRepository.flush();
    }

    @Override
    public <S extends Loaide> S saveAndFlush(S entity) {
        return loaideRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Loaide> List<S> saveAllAndFlush(Iterable<S> entities) {
        return loaideRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Loaide> entities) {
        loaideRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Loaide> entities) {
        loaideRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        loaideRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        loaideRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Loaide getOne(Integer integer) {
        return loaideRepository.getOne(integer);
    }

    @Override
    public Loaide getById(Integer integer) {
        return loaideRepository.getById(integer);
    }

    @Override
    public <S extends Loaide> List<S> findAll(Example<S> example) {
        return loaideRepository.findAll(example);
    }

    @Override
    public <S extends Loaide> List<S> findAll(Example<S> example, Sort sort) {
        return loaideRepository.findAll(example, sort);
    }

    @Override
    public Page<Loaide> findAll(Pageable pageable) {
        return loaideRepository.findAll(pageable);
    }

    @Override
    public <S extends Loaide> S save(S entity) {
        return loaideRepository.save(entity);
    }

    @Override
    public Optional<Loaide> findById(Integer integer) {
        return loaideRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return loaideRepository.existsById(integer);
    }

    @Override
    public long count() {
        return loaideRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        loaideRepository.deleteById(integer);
    }

    @Override
    public void delete(Loaide entity) {
        loaideRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        loaideRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends Loaide> entities) {
        loaideRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        loaideRepository.deleteAll();
    }

    @Override
    public <S extends Loaide> Optional<S> findOne(Example<S> example) {
        return loaideRepository.findOne(example);
    }

    @Override
    public <S extends Loaide> Page<S> findAll(Example<S> example, Pageable pageable) {
        return loaideRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Loaide> long count(Example<S> example) {
        return loaideRepository.count(example);
    }

    @Override
    public <S extends Loaide> boolean exists(Example<S> example) {
        return loaideRepository.exists(example);
    }

    @Override
    public <S extends Loaide, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return loaideRepository.findBy(example, queryFunction);
    }
    //=============== YEN ========================

    @Override
    public List<LoaideDTO> getListLoaide(){
        List<LoaideDTO> result = new ArrayList<LoaideDTO>();
        List<Loaide> loaides = loaideRepository.findAll();
        for(Loaide loaide : loaides){
            result.add(LoaideMapper.toLoaideDTO(loaide));
        }
        return result;
    }
}
