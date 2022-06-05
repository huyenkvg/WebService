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
public class LoaideDTO {
    @NotNull
    private Integer maloaide;
    @Size(max = 50)
    private String tenloaide;
    private Integer socau;
    private Integer thoigian;
}
