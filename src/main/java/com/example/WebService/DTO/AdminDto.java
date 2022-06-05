package com.example.WebService.DTO;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class AdminDto implements Serializable {
    @NotNull
    @Size(min = 1, max = 50)
    private final String email;
    @Size(max = 50)
    private final String hoten;
    @Size(max = 12)
    private final String cmnd;
    @NotNull
    @Size(min = 1, max = 10)
    private final String sdt;
}
