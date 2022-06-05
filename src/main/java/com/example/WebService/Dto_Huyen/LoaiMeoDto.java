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
public class LoaiMeoDto implements Serializable {
    @NotNull
    private  Integer maLoaiMeo;
    @Size(max = 20)
    private  String tenLoaiMeo;
}
