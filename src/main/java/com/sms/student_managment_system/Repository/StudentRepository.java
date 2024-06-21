package com.sms.student_managment_system.Repository;

import com.sms.student_managment_system.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "select s from Student s where s.isActive= :isActive")
    List<Student> findStudentByIsActive(Boolean isActive);
}
