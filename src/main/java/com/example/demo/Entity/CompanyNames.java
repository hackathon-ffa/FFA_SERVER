package com.example.demo.Entity;

import lombok.*;
import javax.persistence.*;
@Entity
@Table(name = "Company")
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class CompanyNames {
    @Id

    @Column(nullable = false, unique = true)
    private String CompanyNameSet;

    public CompanyNames() {
        this.CompanyNameSet = getCompanyNameSet();
    }

    public static void CompanyNames(CompanyNames companyNames) {
        companyNames.CompanyNameSet = companyNames.getCompanyNameSet();
    }
}