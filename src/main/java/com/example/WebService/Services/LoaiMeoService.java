package com.example.WebService.Services;

import com.example.WebService.DTO.LoaiMeoDTO;
import com.example.WebService.Entity_BLX.LoaiMeo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface LoaiMeoService {

    List<LoaiMeoDTO> getListLoaimeo();


    //========================== HUYEN ===============================================================
    List<LoaiMeo> findAll(Sort sort);

    List<LoaiMeo> findAllById(Iterable<Integer> integers);

    <S extends LoaiMeo> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends LoaiMeo> S saveAndFlush(S entity);

    <S extends LoaiMeo> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<LoaiMeo> entities);

    void deleteAllInBatch(Iterable<LoaiMeo> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    LoaiMeo getOne(Integer integer);

    LoaiMeo getById(Integer integer);

    <S extends LoaiMeo> List<S> findAll(Example<S> example);

    <S extends LoaiMeo> List<S> findAll(Example<S> example, Sort sort);

    Page<LoaiMeo> findAll(Pageable pageable);

    <S extends LoaiMeo> S save(S entity);

    Optional<LoaiMeo> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(LoaiMeo entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends LoaiMeo> entities);

    void deleteAll();

    <S extends LoaiMeo> Optional<S> findOne(Example<S> example);

    <S extends LoaiMeo> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends LoaiMeo> long count(Example<S> example);

    <S extends LoaiMeo> boolean exists(Example<S> example);

    <S extends LoaiMeo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

}
