/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BLX;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author HUYENKUTE
 */
@Entity
@Getter
@Setter
@Component
@AllArgsConstructor
@Table(name = "TAIKHOAN")
public class Taikhoan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TENDANGNHAP")
    private String tendangnhap;
    @Size(max = 50)
    @Column(name = "MATKHAU")
    private String matkhau;
    @Size(max = 10)
    @Column(name = "TRANGTHAI")
    private String trangthai;
    @JoinColumn(name = "TENDANGNHAP", referencedColumnName = "EMAIL", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private User user;

    public Taikhoan() {
    }

    public Taikhoan(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    @Override
    public String toString() {
        return "com.example.WebService.Entity_BLX.Taikhoan[ tendangnhap=" + tendangnhap + " ]";
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
