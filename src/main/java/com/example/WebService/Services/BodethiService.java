package com.example.WebService.Services;

import com.example.WebService.DTO.BodethiDTO;
import com.example.WebService.Dto_Huyen.BodethiDto;
import com.example.WebService.Entity_BLX.Bodethi;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface BodethiService {

    List<BodethiDto> findAll();

    List<Bodethi> findAll(Sort sort);

    List<Bodethi> findAllById(Iterable<Integer> integers);

    <S extends Bodethi> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Bodethi> S saveAndFlush(S entity);

    <S extends Bodethi> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Bodethi> entities);

    void deleteAllInBatch(Iterable<Bodethi> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    Bodethi getOne(Integer integer);

    Bodethi getById(Integer integer);

    <S extends Bodethi> List<S> findAll(Example<S> example);

    <S extends Bodethi> List<S> findAll(Example<S> example, Sort sort);

    Page<Bodethi> findAll(Pageable pageable);

    <S extends Bodethi> S save(S entity);

    Optional<Bodethi> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Bodethi entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends Bodethi> entities);

    void deleteAll();

    <S extends Bodethi> Optional<S> findOne(Example<S> example);

    <S extends Bodethi> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Bodethi> long count(Example<S> example);

    <S extends Bodethi> boolean exists(Example<S> example);

    <S extends Bodethi, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

    BodethiDto convertToDto(Bodethi ety);

    //===========================NGAN YEN===============================================================
    BodethiDTO getBoDe(Integer maLoaibang, Integer maLoaide);

}
