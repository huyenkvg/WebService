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
public class LoailithuyetDTO {
    @NotNull
    private Integer maLoaiLiThuyet;
    @Size(max = 50)
    private String tenloai;
}
