package com.example.WebService.Services;

import com.example.WebService.DTO.LoaideDTO;
import com.example.WebService.Dto_Huyen.LoaideDto;
import com.example.WebService.Entity_BLX.Loaide;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface LoaideService {
    List<LoaideDto> findAll();

    List<Loaide> findAll(Sort sort);

    List<Loaide> findAllById(Iterable<Integer> integers);

    <S extends Loaide> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Loaide> S saveAndFlush(S entity);

    <S extends Loaide> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Loaide> entities);

    void deleteAllInBatch(Iterable<Loaide> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    Loaide getOne(Integer integer);

    Loaide getById(Integer integer);

    <S extends Loaide> List<S> findAll(Example<S> example);

    <S extends Loaide> List<S> findAll(Example<S> example, Sort sort);

    Page<Loaide> findAll(Pageable pageable);

    <S extends Loaide> S save(S entity);

    Optional<Loaide> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Loaide entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends Loaide> entities);

    void deleteAll();

    <S extends Loaide> Optional<S> findOne(Example<S> example);

    <S extends Loaide> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Loaide> long count(Example<S> example);

    <S extends Loaide> boolean exists(Example<S> example);

    <S extends Loaide, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
//================ NGAN YEN ====================================
    List<LoaideDTO> getListLoaide();
}
