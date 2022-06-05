package com.example.WebService.Mapper;

import com.example.WebService.Entity_BLX.User;
import com.example.WebService.DTO.UserDTO;

public class UserMapper {
    public static UserDTO toUserDTO(User user){
        UserDTO tmp = new UserDTO();
        tmp.setEmail(user.getEmail());
        tmp.setHoten(user.getHoten());
        tmp.setSdt(user.getSdt());
        return tmp;
    }
}
