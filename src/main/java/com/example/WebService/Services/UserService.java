package com.example.WebService.Services;

import com.example.WebService.DTO.UserDTO;
import com.example.WebService.Entity_BLX.User;

import java.util.List;

public interface UserService {

    List<UserDTO> getListUser();

    List<User> getList();

    UserDTO getUserById(String id);

    void saveUser(User user);

    void deleteUser(String id);

    UserDTO getUserbyTK(String tk, String pass);
}
