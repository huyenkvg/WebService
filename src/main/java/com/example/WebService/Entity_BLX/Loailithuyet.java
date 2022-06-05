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
@Table(name = "LOAILITHUYET")

@Getter
@Setter
@AllArgsConstructor
public class Loailithuyet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MA_LOAI_LI_THUYET")
    private Integer maLoaiLiThuyet;
    @Size(max = 50)
    @Column(name = "TENLOAI")
    private String tenloai;
    @OneToMany(mappedBy = "maLoaiLiThuyet")
    private Collection<Cauhoi> cauhoiCollection;


    public Loailithuyet() {
    }

    public Loailithuyet(Integer maLoaiLiThuyet) {
        this.maLoaiLiThuyet = maLoaiLiThuyet;
    }

}
