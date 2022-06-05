/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BLX;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "LUAT_GT")

@Getter
@Setter
@AllArgsConstructor
public class LuatGt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MALUAT")
    private Integer maluat;
    @Size(max = 200)
    @Column(name = "NOIDUNG")
    private String noidung;
    @Size(max = 100)
    @Column(name = "MUCPHAT")
    private String mucphat;
    @JoinColumn(name = "MA_LOAI_LUAT_GT", referencedColumnName = "MA_LOAI_LUAT_GT")
    @ManyToOne
    private LoaiLuatGt maLoaiLuatGt;

    public LuatGt() {
    }

    public LuatGt(Integer maluat) {
        this.maluat = maluat;
    }

    
}
