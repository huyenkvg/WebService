package com.example.WebService.Services;

import com.example.WebService.DTO.LoaibangDTO;
import com.example.WebService.Dto_Huyen.LoaibangDto;
import com.example.WebService.Entity_BLX.Loaibang;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface LoaibangService {
    List<LoaibangDto> findAll();

    List<Loaibang> findAll(Sort sort);

    List<Loaibang> findAllById(Iterable<Integer> integers);

    <S extends Loaibang> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Loaibang> S saveAndFlush(S entity);

    <S extends Loaibang> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Loaibang> entities);

    void deleteAllInBatch(Iterable<Loaibang> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    Loaibang getOne(Integer integer);

    Loaibang getById(Integer integer);

    <S extends Loaibang> List<S> findAll(Example<S> example);

    <S extends Loaibang> List<S> findAll(Example<S> example, Sort sort);

    Page<Loaibang> findAll(Pageable pageable);

    <S extends Loaibang> S save(S entity);

    Optional<Loaibang> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Loaibang entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends Loaibang> entities);

    void deleteAll();

    <S extends Loaibang> Optional<S> findOne(Example<S> example);

    <S extends Loaibang> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Loaibang> long count(Example<S> example);

    <S extends Loaibang> boolean exists(Example<S> example);

    <S extends Loaibang, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
    //================== Ngan Yen ===========================================

    List<LoaibangDTO> getListLoaibang();
}
