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

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "BODETHI")
@Getter
@Setter
@AllArgsConstructor
public class Bodethi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MABODETHI", nullable = false)
    private Integer mabodethi;
    @OneToMany(mappedBy = "maBoDe")
    private Collection<Cauhoi> cauhoiCollection;
    @JoinColumn(name = "MALOAIBANG", referencedColumnName = "MALOAIBANG", nullable = false)
    @ManyToOne(optional = false)
    private Loaibang maloaibang;
    @JoinColumn(name = "MALOAIDE", referencedColumnName = "MALOAIDE", nullable = false)
    @ManyToOne(optional = false)
    private Loaide maloaide;

    public Bodethi() {
    }

    public Bodethi(Integer mabodethi) {
        this.mabodethi = mabodethi;
    }
    
}
