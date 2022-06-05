/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BLX;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "LOAIBANG")

@Getter
@Setter
public class Loaibang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MALOAIBANG", nullable = false)
    private Integer maloaibang;
    @Column(name = "TENLOAIBANG", length = 50)
    private String tenloaibang;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maloaibang")
    private Collection<Bodethi> bodethiCollection;

    public Loaibang() {
    }

    public Loaibang(Integer maloaibang) {
        this.maloaibang = maloaibang;
    }


}
