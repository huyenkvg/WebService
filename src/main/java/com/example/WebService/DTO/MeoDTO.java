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
public class MeoDTO {
    private Integer maMeo;
    @Size(max = 200)
    private String noidung;
}
