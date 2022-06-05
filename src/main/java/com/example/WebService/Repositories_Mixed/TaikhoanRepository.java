package com.example.WebService.Repositories_Mixed;

import com.example.WebService.Entity_BLX.Taikhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaikhoanRepository extends JpaRepository<Taikhoan, String> {
//    @Modifying
//    @Transactional
//    @Query("UPDATE Taikhoan SET matkhau =:mk  WHERE tendangnhap=:tendn")
//    void updateMK_TK(@Param("tendangnhap") String tendn, @Param("matkhau") String mk);
//
//    @Query("UPDATE Taikhoan SET trangthai =:tt  WHERE tendangnhap=:tendn")
//    void updateTT_TK(@Param("tendangnhap") String tendn, @Param("trangthai") String tt);

}