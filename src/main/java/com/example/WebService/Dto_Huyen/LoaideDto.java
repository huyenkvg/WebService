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
public class LoaideDto implements Serializable {
    @NotNull
    private  Integer maloaide;
    @Size(max = 50)
    private  String tenloaide;
    private  Integer socau;
    private Integer thoigian;
}
