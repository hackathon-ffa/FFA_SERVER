package com.example.demo.controller;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Entity.UserRestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Rest_Request {

    public UserRestEntity userRestEntity;

    @PostMapping("/user/statehome")
    public String Home() {
        userRestEntity.getUserStateHome();
        return userRestEntity.getUserStateHome();
    }
    @PostMapping("/user/Period")
    public String Period() {
        userRestEntity.getUserStateHome();
        return Period();
    }

    @PostMapping("/user/Kind")
    public String Kind() {
        userRestEntity.UserVacationKind = Kind();
        return Kind();
    }

    @PostMapping("/user/Reason")
    public String Reason() {
        userRestEntity.UserVacationReason = Reason();
        return Reason();
    }
}
