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
public class LoaiLuatGtDto implements Serializable {
    @NotNull
    private  Integer maLoaiLuatGt;
    @Size(max = 50)
    private  String tenLoaiLuatGt;
}
