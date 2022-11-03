package com.example.demo.controller;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class MainController {

    private final UserRepository userRepository;
    UserEntity userEntity = new UserEntity();

    @Autowired
    private PasswordEncoder passwordEncoder;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/user/home")
    private String Login(@RequestBody UserEntity user) {
        UserEntity.UserEntity(user);
        System.out.println("시간이 들어오겠군");
        return "뿅";
    }

    @GetMapping("/user/graph")
    private String  graph() {
        return userRepository.findAll().toString();
    }


    @GetMapping("/user/starttime")
    private LocalDateTime Start_time(@DateTimeFormat(pattern = "yyyy.MM.dd'T'HH.mm.ss")
                                    @RequestParam("requestdatetime")LocalDateTime requestdatetime ) {
        System.out.println(requestdatetime);
        return requestdatetime;
    }

    @PostMapping("/Button")                  //사용자가 localhost:8080/test 로 접속할 때 상황
    public boolean Test() {                      //test로 접속하면 실행할 메소드
        if(userEntity.WorkButton == false)  userEntity.WorkButton = true;
        else userEntity.WorkButton = false;
        return userEntity.WorkButton; // String을 /test에 반환해줌
    }


    @PostMapping("/login")
    public UserEntity login(@RequestBody UserEntity user) {
        String Login_Id;
        String Login_Password;



        return user;
    }


    @PostMapping("/signup")
    public UserEntity signup(@RequestBody UserEntity user) {
        System.out.println(">>"+user.toString());
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        UserEntity.UserEntity(user);
        System.out.println("signUp 작동");
        return user;
    }

    @GetMapping( "/admin/users")
    @ResponseBody
    public String GetUser(UserEntity userEntity) {
        return userRepository.findAll().toString(); //프론트에서 슬라이스해서 쓸거예요
    }

    @GetMapping("admin/editusers")
    public  String GetUser() {
        return userRepository.findAll().toString(); //프론트에서 슬라이스해서 쓸거예요
    }
}
