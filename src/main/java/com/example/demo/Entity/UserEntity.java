package com.example.demo.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "midas")
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class UserEntity {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_code;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = false, unique = true)
    private String Password;

    @Column(nullable = false)
    private String UserRight;             // 유저,관리자

    @Column(nullable = false)
    private String UserName;            // 유저이름

    @Column(nullable = false)
    public String UserState = "퇴근";     // 유저상태(회사, 출근,재택,휴가)

    @Column(nullable = false)
    private String UserRole;      // 유저 부서

    @Column
    private String Meeting;             // 미팅

    @Column
    private String MeetingTime;         // 미팅시간

    @Column
    private String MeetingPlace;        //미팅 위치

    @Column(nullable = false)
    public boolean WorkButton = false;         // 출,퇴근 버튼

    @ElementCollection
    private List<String> Start_Time;             //출근한 시간

    @ElementCollection
    private List<String> Last_Time;              //퇴근한 시간

    public UserEntity() {
        this.userId = getUserId();
        this.Password = getPassword();
        this.UserRight = getUserRight();
        this.UserName = getUserName();
        this.UserState = getUserState();
        this.UserRole = getUserRole();
        this.Meeting = getMeeting();
        this.MeetingTime = getMeetingTime();
        this.MeetingPlace = getMeetingPlace();
        this.Start_Time = getStart_Time();
        this.Last_Time = getLast_Time();
    }


    public static void UserEntity(UserEntity user) {
        user.userId = user.getUserId();
        user.Password = user.getPassword();
        user.UserRight = user.getUserRight();
        user.UserName = user.getUserName();
        user.UserState = user.getUserState();
        user.UserRole = user.getUserRole();
        user.Meeting = user.getMeeting();
        user.MeetingTime = user.getMeetingTime();
        user.MeetingPlace = user.getMeetingPlace();
        user.Start_Time = user.getStart_Time();
        user.Last_Time = user.getLast_Time();
    }
}



//출근시간 받기
//재택 / 회사라면
//boolean true로 만들기

//새로고침 할때마다 시간 불러오기

