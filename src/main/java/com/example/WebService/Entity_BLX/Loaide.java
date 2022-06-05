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
@Table(name = "LOAIDE")

@Getter
@Setter
@AllArgsConstructor
public class Loaide implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MALOAIDE")
    private Integer maloaide;
    @Size(max = 50)
    @Column(name = "TENLOAIDE")
    private String tenloaide;
    @Column(name = "SOCAU")
    private Integer socau;
    @Column(name = "THOIGIAN")
    private Integer thoigian;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maloaide")
    private Collection<Bodethi> bodethiCollection;



    public Loaide() {
    }

    public Loaide(Integer maloaide) {
        this.maloaide = maloaide;
    }
}
