package com.example.WebService.Controller;


import com.example.WebService.Entity_BLX.Admin;
import com.example.WebService.Entity_BLX.Loaibang;
import com.example.WebService.Services.AdminService;
import com.example.WebService.Services.Impl.LoaibangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test/")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private LoaibangServiceImpl bang;

}