package com.example.WebService.Dto_Huyen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BodethiDto implements Serializable {
    @NotNull
    private Integer mabodethi;
    @NotNull
    private  Integer maloaibang;
    @NotNull
    private  Integer maloaide;
}
