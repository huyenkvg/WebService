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

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "CAUHOI")
@Getter
@Setter
@AllArgsConstructor
public class Cauhoi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MACAUHOI", nullable = false)
    private Integer macauhoi;
    @Column(name = "NOIDUNG", length = 200)
    private String noidung;
    @Column(name = "A", length = 200)
    private String a;
    @Column(name = "B", length = 200)
    private String b;
    @Column(name = "C", length = 200)
    private String c;
    @Column(name = "D", length = 200)
    private String d;
    @Column(name = "DAPAN", length = 10)
    private String dapan;
    @Column(name = "HINHANH", length = 200)
    private String hinhAnh;
    @JoinColumn(name = "MABODE", referencedColumnName = "MABODETHI")
    @ManyToOne
    private Bodethi maBoDe;
    @JoinColumn(name = "MA_LOAI_LI_THUYET", referencedColumnName = "MA_LOAI_LI_THUYET")
    @ManyToOne
    private Loailithuyet maLoaiLiThuyet;


    public Cauhoi() {
    }

    public Cauhoi(Integer macauhoi) {
        this.macauhoi = macauhoi;
    }
}
