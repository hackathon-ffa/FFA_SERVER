package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ManagerDTO {
    private String ManagerId;

    private String ManagerPassword;

    private String CompanyName;

    private String CoreTime;

    private String RoleName;
}