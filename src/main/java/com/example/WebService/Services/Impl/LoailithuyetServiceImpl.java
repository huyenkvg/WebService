package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.LoailithuyetDTO;
import com.example.WebService.Dto_Huyen.LoailithuyetDto;
import com.example.WebService.Entity_BLX.Loailithuyet;
import com.example.WebService.Mapper.LoailithuyetMapper;
import com.example.WebService.Repositories_Mixed.LoailithuyetRepository;
import com.example.WebService.Services.LoailithuyetService;
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
public class LoailithuyetServiceImpl implements LoailithuyetService {
    @Autowired
    private LoailithuyetRepository loailithuyetRepository;
    @Autowired
    private ModelMapper modelMapper;

    public LoailithuyetDto convertToDto(Loailithuyet ety) {

        LoailithuyetDto Dto = new LoailithuyetDto(ety.getMaLoaiLiThuyet(), ety.getTenloai());
        return Dto;
    }

    @Override
    public List<LoailithuyetDto> findAll() {
        return loailithuyetRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Loailithuyet> findAll(Sort sort) {
        return loailithuyetRepository.findAll(sort);
    }

    @Override
    public List<Loailithuyet> findAllById(Iterable<Integer> integers) {
        return loailithuyetRepository.findAllById(integers);
    }

    @Override
    public <S extends Loailithuyet> List<S> saveAll(Iterable<S> entities) {
        return loailithuyetRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        loailithuyetRepository.flush();
    }

    @Override
    public <S extends Loailithuyet> S saveAndFlush(S entity) {
        return loailithuyetRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Loailithuyet> List<S> saveAllAndFlush(Iterable<S> entities) {
        return loailithuyetRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Loailithuyet> entities) {
        loailithuyetRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Loailithuyet> entities) {
        loailithuyetRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        loailithuyetRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        loailithuyetRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Loailithuyet getOne(Integer integer) {
        return loailithuyetRepository.getOne(integer);
    }

    @Override
    public Loailithuyet getById(Integer integer) {
        return loailithuyetRepository.getById(integer);
    }

    @Override
    public <S extends Loailithuyet> List<S> findAll(Example<S> example) {
        return loailithuyetRepository.findAll(example);
    }

    @Override
    public <S extends Loailithuyet> List<S> findAll(Example<S> example, Sort sort) {
        return loailithuyetRepository.findAll(example, sort);
    }

    @Override
    public Page<Loailithuyet> findAll(Pageable pageable) {
        return loailithuyetRepository.findAll(pageable);
    }

    @Override
    public <S extends Loailithuyet> S save(S entity) {
        return loailithuyetRepository.save(entity);
    }

    @Override
    public Optional<Loailithuyet> findById(Integer integer) {
        return loailithuyetRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return loailithuyetRepository.existsById(integer);
    }

    @Override
    public long count() {
        return loailithuyetRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        loailithuyetRepository.deleteById(integer);
    }

    @Override
    public void delete(Loailithuyet entity) {
        loailithuyetRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        loailithuyetRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends Loailithuyet> entities) {
        loailithuyetRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        loailithuyetRepository.deleteAll();
    }

    @Override
    public <S extends Loailithuyet> Optional<S> findOne(Example<S> example) {
        return loailithuyetRepository.findOne(example);
    }

    @Override
    public <S extends Loailithuyet> Page<S> findAll(Example<S> example, Pageable pageable) {
        return loailithuyetRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Loailithuyet> long count(Example<S> example) {
        return loailithuyetRepository.count(example);
    }

    @Override
    public <S extends Loailithuyet> boolean exists(Example<S> example) {
        return loailithuyetRepository.exists(example);
    }

    @Override
    public <S extends Loailithuyet, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return loailithuyetRepository.findBy(example, queryFunction);
    }
    ///================YEN===========================
    @Override
    public List<LoailithuyetDTO> getListLoailt(){
        List<LoailithuyetDTO> result = new ArrayList<>();
        List<Loailithuyet> loailt = loailithuyetRepository.findAll();
        for(Loailithuyet loailithuyet : loailt){
            result.add(LoailithuyetMapper.toLoailithuyetDTO(loailithuyet));
        }
        return result;
    }

    @Override
    public LoailithuyetDTO getLoailtByID(Integer id){
        List<Loailithuyet> loailithuyets = loailithuyetRepository.findAll();
        for(Loailithuyet loailt : loailithuyets){
            if(loailt.getMaLoaiLiThuyet() == id){
                return LoailithuyetMapper.toLoailithuyetDTO(loailt);
            }
        }
        return null;
    }

}
