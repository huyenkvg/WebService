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
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "LOAI_LUAT_GT")

@Getter
@Setter
@AllArgsConstructor
public class LoaiLuatGt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MA_LOAI_LUAT_GT")
    private Integer maLoaiLuatGt;
    @Size(max = 100)
    @Column(name = "TEN_LOAI_LUAT_GT")
    private String tenLoaiLuatGt;
    @OneToMany(mappedBy = "maLoaiLuatGt")
    private Collection<LuatGt> luatGtCollection;

    public LoaiLuatGt() {
    }

    public LoaiLuatGt(Integer maLoaiLuatGt) {
        this.maLoaiLuatGt = maLoaiLuatGt;
    }

}
