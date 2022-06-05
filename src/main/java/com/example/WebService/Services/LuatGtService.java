package com.example.WebService.Services;

import com.example.WebService.DTO.LuatDTO;
import com.example.WebService.Dto_Huyen.LuatGtDto;
import com.example.WebService.Entity_BLX.LuatGt;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface LuatGtService {
    List<LuatGtDto> findAll();

    List<LuatGt> findAll(Sort sort);

    List<LuatGt> findAllById(Iterable<String> strings);

    <S extends LuatGt> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends LuatGt> S saveAndFlush(S entity);

    <S extends LuatGt> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<LuatGt> entities);

    void deleteAllInBatch(Iterable<LuatGt> entities);

    void deleteAllByIdInBatch(Iterable<String> strings);

    void deleteAllInBatch();

    @Deprecated
    LuatGt getOne(String s);

    LuatGt getById(String s);

    <S extends LuatGt> List<S> findAll(Example<S> example);

    <S extends LuatGt> List<S> findAll(Example<S> example, Sort sort);

    Page<LuatGt> findAll(Pageable pageable);

    <S extends LuatGt> S save(S entity);

    Optional<LuatGt> findById(String s);

    boolean existsById(String s);

    long count();

    void deleteById(String s);

    void delete(LuatGt entity);

    void deleteAllById(Iterable<? extends String> strings);

    void deleteAll(Iterable<? extends LuatGt> entities);

    void deleteAll();

    <S extends LuatGt> Optional<S> findOne(Example<S> example);

    <S extends LuatGt> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends LuatGt> long count(Example<S> example);

    <S extends LuatGt> boolean exists(Example<S> example);

    <S extends LuatGt, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
    //=======YEN
    List<LuatDTO> getLuatByLoaiLuat(Integer maLoailuat);
}
