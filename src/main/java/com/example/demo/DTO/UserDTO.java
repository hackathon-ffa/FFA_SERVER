package com.example.demo.DTO;


import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class UserDTO {
    Long id;
    private String UserId;
    private String Password;
    private Long UserRight;             // 유저,관리자
    private String UserName;            // 유저이름
    private String CompanyName;         // 회사이름
    private Long UserState;             // 유저상태(출근,재택,휴가)
    private String UserDepartment;      // 유저 부서
    private String Meeting;             // 미팅
    private String MeetingTime;         // 미팅시간

    public Object getPassword() {
        return getPassword();
    }

    public Object getUserId() {
        return getUserId();
    }

    UserEntity userEntities;

    public static Object returnjobs() {
        return ResponseEntity.ok().body(new UserEntity());
    }
}
