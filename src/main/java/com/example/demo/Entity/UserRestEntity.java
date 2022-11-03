package com.example.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Rest")
@Getter
@Setter
public class UserRestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String UserStateHome;                  // 유저상태(재택)

    @Column(nullable = false)
    private String UserStateVacation;              // 유저상태(휴가)

    @Column(nullable = false)
    public String UserVacationPeriod;             // 휴가 기간

    @Column(nullable = false)
    public String UserVacationKind;                // 휴가 종류

    @Column(nullable = false)
    public String UserVacationReason;             // 휴가사유



}
