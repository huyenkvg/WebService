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
public class LuatGtDto implements Serializable {
    private Integer maluat;
    @Size(max = 200)
    private String noidung;
    @Size(max = 100)
    private String mucphat;
}
