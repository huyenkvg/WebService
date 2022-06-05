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
public class TaikhoanDTO {
    @NotNull
    @Size(min = 1, max = 50)
    private String tendangnhap;
    @Size(max = 50)
    private String matkhau;
    @Size(max = 10)
    private String trangthai;
}
