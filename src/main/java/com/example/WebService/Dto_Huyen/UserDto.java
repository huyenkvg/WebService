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
public class UserDto implements Serializable {
    @NotNull
    @Size(min = 1, max = 50)
    private  String email;
    @Size(max = 50)
    private  String hoten;
    @NotNull
    @Size(min = 1, max = 10)
    private  String sdt;
}
