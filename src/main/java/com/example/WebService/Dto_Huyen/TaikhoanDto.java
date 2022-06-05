package com.example.WebService.Dto_Huyen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TaikhoanDto implements Serializable {
    @NotNull
    @Size(min = 1, max = 50)
    private  String tendangnhap;
    @Size(max = 50)
    private  String matkhau;
    @Size(max = 10)
    private String trangthai;
    @NotNull
    @Size(min = 1, max = 50)
    private  String userEmail;
}
