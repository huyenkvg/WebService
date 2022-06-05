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
@Table(name = "MEO")
@Getter
@Setter
@AllArgsConstructor
public class Meo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MA_MEO")
    private Integer maMeo;
    @Size(max = 200)
    @Column(name = "NOIDUNG")
    private String noidung;
    @JoinColumn(name = "MA_LOAI_MEO", referencedColumnName = "MA_LOAI_MEO")
    @ManyToOne
    private LoaiMeo maLoaiMeo;

    public Meo() {
    }

    public Meo(Integer maMeo) {
        this.maMeo = maMeo;
    }

}
