package com.example.demo.Entity;

import lombok.*;
import javax.persistence.*;
@Entity
@Table(name = "manager")
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString

public class ManagerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String manager_code = "1";

    @Column(nullable = false, unique = true)
    private String ManagerId;

    @Column(nullable = false, unique = true)
    private String ManagerPassword;

    @Column(nullable = false)
    private String CompanyName;

    @Column
    private String CoreTime;

    @Column
    private String RoleName;

    public ManagerEntity() {
        this.ManagerId = getManagerId();
        this.ManagerPassword = getManagerPassword();
        this.CompanyName = getCompanyName();
        this.CoreTime = getCoreTime();
        this.RoleName = getRoleName();
    }


}
