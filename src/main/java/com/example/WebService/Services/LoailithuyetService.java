package com.example.WebService.Services;

import com.example.WebService.DTO.LoailithuyetDTO;
import com.example.WebService.Dto_Huyen.LoailithuyetDto;
import com.example.WebService.Entity_BLX.Loailithuyet;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface LoailithuyetService {
    List<LoailithuyetDto> findAll();

    List<Loailithuyet> findAll(Sort sort);

    List<Loailithuyet> findAllById(Iterable<Integer> integers);

    <S extends Loailithuyet> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Loailithuyet> S saveAndFlush(S entity);

    <S extends Loailithuyet> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Loailithuyet> entities);

    void deleteAllInBatch(Iterable<Loailithuyet> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    Loailithuyet getOne(Integer integer);

    Loailithuyet getById(Integer integer);

    <S extends Loailithuyet> List<S> findAll(Example<S> example);

    <S extends Loailithuyet> List<S> findAll(Example<S> example, Sort sort);

    Page<Loailithuyet> findAll(Pageable pageable);

    <S extends Loailithuyet> S save(S entity);

    Optional<Loailithuyet> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Loailithuyet entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends Loailithuyet> entities);

    void deleteAll();

    <S extends Loailithuyet> Optional<S> findOne(Example<S> example);

    <S extends Loailithuyet> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Loailithuyet> long count(Example<S> example);

    <S extends Loailithuyet> boolean exists(Example<S> example);

    <S extends Loailithuyet, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

    //============ NGAN YEN ================
    List<LoailithuyetDTO> getListLoailt();

    LoailithuyetDTO getLoailtByID(Integer id);
}
