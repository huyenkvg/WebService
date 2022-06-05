package com.example.WebService.Services;

import com.example.WebService.DTO.LoaiLuatDTO;
import com.example.WebService.Dto_Huyen.LoaiLuatGtDto;
import com.example.WebService.Entity_BLX.LoaiLuatGt;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface LoaiLuatGtService {
    List<LoaiLuatGtDto> findAll();

    List<LoaiLuatGt> findAll(Sort sort);

    List<LoaiLuatGt> findAllById(Iterable<Integer> integers);

    <S extends LoaiLuatGt> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends LoaiLuatGt> S saveAndFlush(S entity);

    <S extends LoaiLuatGt> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<LoaiLuatGt> entities);

    void deleteAllInBatch(Iterable<LoaiLuatGt> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    LoaiLuatGt getOne(Integer integer);

    LoaiLuatGt getById(Integer integer);

    <S extends LoaiLuatGt> List<S> findAll(Example<S> example);

    <S extends LoaiLuatGt> List<S> findAll(Example<S> example, Sort sort);

    Page<LoaiLuatGt> findAll(Pageable pageable);

    <S extends LoaiLuatGt> S save(S entity);

    Optional<LoaiLuatGt> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(LoaiLuatGt entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends LoaiLuatGt> entities);

    void deleteAll();

    <S extends LoaiLuatGt> Optional<S> findOne(Example<S> example);

    <S extends LoaiLuatGt> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends LoaiLuatGt> long count(Example<S> example);

    <S extends LoaiLuatGt> boolean exists(Example<S> example);

    <S extends LoaiLuatGt, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

    //================= YEN ===================
    List<LoaiLuatDTO> getListLoailuat();
}
