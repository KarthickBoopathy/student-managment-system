package com.sms.student_managment_system.Controller;

import com.sms.student_managment_system.Dto.StudentDto;
import com.sms.student_managment_system.Entity.Student;
import com.sms.student_managment_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/health")
    public String healthCheckup() {
        return "Status : UP";
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.createNewStudent(student);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.fetchAllStudents();
    }

    @GetMapping("/getStudentsByActive/{isActive}")
    public List<Student> getStudentsByActive(@PathVariable Boolean isActive) {
        return studentService.fetchStudentsByActive(isActive);
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.fetchStudentById(id);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable Long id) {
        return studentService.removeStudentById(id);
    }

    @PutMapping("/updateStudents/{id}/{isFeePaid}")
    public Student updateStudentsFee(@PathVariable Long id, @PathVariable Boolean isFeePaid){
        return studentService.updateStudentsById(id, isFeePaid);
    }

}
