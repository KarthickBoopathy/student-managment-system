package com.sms.student_managment_system.Dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class StudentDto {
    private long id;
    private String name;
    private String course;
    private String duration;
    private Boolean isActive;
    private Boolean isFeePaid;
}
