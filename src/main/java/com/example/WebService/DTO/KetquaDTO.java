package com.example.WebService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KetquaDTO {
    @Id
    @Basic(optional = false)
    private Integer id;
    private String phuongan;
    private Integer luotthi;

}
