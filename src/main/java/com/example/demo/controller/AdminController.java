package com.example.demo.controller;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    private UserRepository userRepository;
    private UserService userService;


    @GetMapping("/admin/jobs")
    private String members(@RequestParam Long id) {
        return (String) UserDTO.returnjobs();
    }


}
