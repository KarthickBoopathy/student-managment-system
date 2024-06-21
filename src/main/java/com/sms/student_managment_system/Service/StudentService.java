package com.sms.student_managment_system.Service;

import com.sms.student_managment_system.Dto.StudentDto;
import com.sms.student_managment_system.Entity.Student;
import com.sms.student_managment_system.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createNewStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> fetchAllStudents(){
        return studentRepository.findAll();
    }

    public List<Student> fetchStudentsByActive(Boolean isActive){
        return studentRepository.findStudentByIsActive(isActive);
    }

    public Student fetchStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public String removeStudentById(Long id){
        try{
            studentRepository.deleteById(id);
            return "Deleted Successfully";
        }
        catch (Exception ex){
            return ex.getMessage();
        }
    }

    public Student updateStudentsById(Long id, Boolean isFeePaid){
        Student student1 = studentRepository.findById(id).get();
        student1.setIsFeePaid(isFeePaid);
        return studentRepository.save(student1);
    }
}
