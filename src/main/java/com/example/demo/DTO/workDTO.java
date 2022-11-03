package com.example.demo.DTO;

import lombok.Data;

@Data
public class workDTO {
    public class SpecialtyDto {
        String Monday;
        String Tuesday;
        String Wendsday;
        String Tuersday;
        String Friday;
        String Saterday;
        String Sunday;

        public SpecialtyDto(String Monday, String Tuesday, String Wendsday, String Tuersday, String Friday, String Saterday, String Sunday) {
            this.Monday = Monday;
            this.Tuesday = Tuesday;
            this.Wendsday = Wendsday;
            this.Tuersday = Tuersday;
            this.Friday = Friday;
            this.Saterday = Saterday;
            this.Sunday = Sunday;
        }

        public String getMonday() {
            return Monday;
        }

        public String getTuesday() {
            return Tuesday;
        }

        public String getWendsday() {
            return Wendsday;
        }

        public String getTuersday() {
            return Tuersday;
        }

        public String getFriday() {
            return Friday;
        }

        public String getSunday() {
            return Sunday;
        }
    }
}
