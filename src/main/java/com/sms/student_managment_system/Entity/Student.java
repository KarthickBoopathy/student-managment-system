package com.sms.student_managment_system.Entity;

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
@Entity
@Table(name = "student")
public class Student {
    @Id
    @SequenceGenerator(name="student_id_seq", sequenceName = "student_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")
    @Column(name="id", updatable = false)
    private long id;

    private String name;
    private String course;
    private String duration;
    private Boolean isActive;
    private Boolean isFeePaid;
}
