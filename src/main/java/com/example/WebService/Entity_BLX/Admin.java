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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@AllArgsConstructor
@Table(name = "ADMIN")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 50)
    @Column(name = "HOTEN")
    private String hoten;
    @Size(max = 12)
    @Column(name = "CMND")
    private String cmnd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "SDT")
    private String sdt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "admin")
    private TaikhoanAdmin taikhoanAdmin;

    public Admin() {
    }

    public Admin(String email) {
        this.email = email;
    }

    public Admin(String email, String sdt) {
        this.email = email;
        this.sdt = sdt;
    }
    public String showSth(){
        return email;
    }

}
