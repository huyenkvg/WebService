package com.example.WebService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoaiMeoDTO {
    private Integer maLoaiMeo;
    @Size(max = 100)
    private String tenLoaiMeo;
}
