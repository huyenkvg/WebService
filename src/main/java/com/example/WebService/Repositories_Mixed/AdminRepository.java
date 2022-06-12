package com.example.WebService.Repositories_Mixed;

import com.example.WebService.Entity_BLX.Admin;
import com.example.WebService.Entity_BLX.Cauhoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
//    @Modifying
//    @Transactional
//    @Query("UPDATE ADMIN SET cmnd =:cmnd  WHERE email=:email")
//    void editByEmail(@Param("email") String email, @Param("cmnd") String cmnd);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO ADMIN (EMAIL, CMND, hoten, sdt ) VALUES  (:email, :cmnd , :hoten, :sdt)",nativeQuery = true)
    void insert(@Param("email") String email, @Param("cmnd") String cmnd, @Param("hoten") String hoten, @Param("sdt") String sdt);


    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "SELECT * FROM Admin  WHERE email=:email")
    Admin findAdminByEmail(@Param("email") String email);

}