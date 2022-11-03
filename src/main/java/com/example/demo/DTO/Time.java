package com.example.demo.DTO;

import java.util.List;



public class Time {

    List<workDTO.SpecialtyDto> specialties;

    public Time(List<workDTO.SpecialtyDto> specialties) {

        this.specialties = specialties;
    }

    public List<workDTO.SpecialtyDto> getSpecialties() {
        return specialties;
    }
}