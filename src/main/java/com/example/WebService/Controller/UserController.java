package com.example.WebService.Controller;

import com.example.WebService.Entity_BLX.Cauhoi;
import com.example.WebService.Entity_BLX.Taikhoan;
import com.example.WebService.Entity_BLX.User;
import com.example.WebService.DTO.UserDTO;
import com.example.WebService.Services.TaiKhoanService;
import com.example.WebService.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping("get")
    public List<UserDTO> getUsers() {
        List<UserDTO> users = userService.getListUser();
        return users;
    }

    @GetMapping("getById")
    public UserDTO getUserById(@RequestParam(name="email") String id){
        UserDTO user = userService.getUserById(id);
        return user;
    }

    @GetMapping("getuserbytk")
    public UserDTO getUserById(@RequestParam(name="email") String tk,@RequestParam(name="pass") String pass) throws NoSuchAlgorithmException {
        UserDTO user = userService.getUserbyTK(tk,taiKhoanService.maHoaMK(pass));
        return user;
    }

    @PostMapping("insertUser")
    public User insertUser(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }
    @PostMapping("insert")
   public Taikhoan insertTK(@RequestParam(name="email") String email, @RequestParam(name="hoten") String hoten,
   @RequestParam(name="sdt") String sdt,@RequestParam(name="matkhau") String mk) throws NoSuchAlgorithmException {
        User user = new User();
        user.setEmail(email);
        user.setHoten(hoten);
        user.setSdt(sdt);
        Taikhoan tk = new Taikhoan();
        tk.setTendangnhap(email);
        tk.setMatkhau(taiKhoanService.maHoaMK(mk));
        tk.setTrangthai("1");
        user.setTaikhoan(tk);
        userService.saveUser(user);
        return tk;
    }


    @PutMapping("update")
    public User updateUser(@RequestBody User user){
        System.out.println("id: "+user.getEmail());
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("delete")
    public void deleteUser(@RequestParam(name="email") String id){
        userService.deleteUser(id);
    }

    @PutMapping("updateTK")
    public Taikhoan updateTK(@RequestBody Taikhoan taikhoan){
        List<User> users = userService.getList();
        for(User user : users){
            if(user.getEmail().equals(taikhoan.getTendangnhap())){
                user.setTaikhoan(taikhoan);
                userService.saveUser(user);
            }
        }
        return taikhoan;
    }

    @PutMapping("deleteTK")
    public void deleteTK(@RequestParam(name="tendangnhap") String id){
        List<User> users = userService.getList();
        for(User user : users){
            if(user.getEmail().equals(id)){
                user.getTaikhoan().setTrangthai("0");
                userService.saveUser(user);
            }
        }
    }

}
