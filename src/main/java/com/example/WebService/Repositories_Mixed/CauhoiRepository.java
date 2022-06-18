package com.example.WebService.Repositories_Mixed;

import com.example.WebService.Entity_BLX.Cauhoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CauhoiRepository extends JpaRepository<Cauhoi, Integer> {
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "SELECT * FROM Cauhoi e ORDER BY NEWID()")
    List<Cauhoi> findCauHoi();
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "SELECT * FROM Cauhoi")
    List<Cauhoi> find_ALL_CauHoi();

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "SELECT c.* FROM KETQUA e,CAUHOI c WHERE e.MACAUHOI = c.MACAUHOI and e.LUOTTHI =:luotthi and e.MAUSER=:email " +
            "and c.MABODE =:mabode")
    List<Cauhoi> getKQ_Cauhoi(@Param("email") String email,@Param("luotthi") Integer luotthi,@Param("mabode") Integer mabode);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "SELECT c.* FROM KETQUA e,CAUHOI c WHERE e.MACAUHOI = c.MACAUHOI and e.MAUSER=:email " +
            "and c.MABODE =:mabode")
    List<Cauhoi> getCauHoi(@Param("email") String email,@Param("mabode") Integer mabode);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "DELETE  FROM Cauhoi Where Macauhoi=:macauhoi")
    void DeleteCauHoi(@Param("macauhoi") String macauhoi);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "select * from cauhoi where MA_LOAI_LI_THUYET = :maloailythuyet")
    List<Cauhoi> demCauHoi(@Param("maloailythuyet") String maloailythuyet);
}