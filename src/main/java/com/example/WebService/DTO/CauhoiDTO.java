package com.example.WebService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CauhoiDTO {
    @NotNull
    private Integer macauhoi;
    @Size(max = 200)
    private String noidung;
    @Size(max = 200)
    private String a;
    @Size(max = 200)
    private String b;
    @Size(max = 200)
    private String c;
    @Size(max = 200)
    private String d;
    @Size(max = 10)
    private String dapan;
    @Size(max = 200)
    private String hinhanh;
}
