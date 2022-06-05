package com.example.WebService.Dto_Huyen;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto implements Serializable {
    @NotNull
    @Size(min = 1, max = 50)
    private String email ;
    @Size(max = 50)
    private String hoten ;
    @Size(max = 12)
    private  String cmnd;
    @NotNull
    @Size(min = 1, max = 10)
    private String sdt;
}
