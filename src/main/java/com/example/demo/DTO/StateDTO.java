package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateDTO {

    private String Company;

    private String Home;

    private String Vacation;

    private String Absent;

    private String LeaveWork;
}