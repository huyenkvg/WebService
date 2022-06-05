/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BLX;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
@Table(name = "TAIKHOAN_ADMIN")

@Getter
@Setter
@AllArgsConstructor
public class TaikhoanAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TENDANGNHAP")
    private String tendangnhap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MATKHAU")
    private String matkhau;
    @Column(name = "TRANGTHAI")
    private Boolean trangthai;
    @JoinColumn(name = "TENDANGNHAP", referencedColumnName = "EMAIL", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Admin admin;

    public TaikhoanAdmin() {
    }

    public TaikhoanAdmin(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public TaikhoanAdmin(String tendangnhap, String matkhau) {
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
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

    public Boolean getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Boolean trangthai) {
        this.trangthai = trangthai;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tendangnhap != null ? tendangnhap.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaikhoanAdmin)) {
            return false;
        }
        TaikhoanAdmin other = (TaikhoanAdmin) object;
        if ((this.tendangnhap == null && other.tendangnhap != null) || (this.tendangnhap != null && !this.tendangnhap.equals(other.tendangnhap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.WebService.Entity_BLX.TaikhoanAdmin[ tendangnhap=" + tendangnhap + " ]";
    }
    
}
