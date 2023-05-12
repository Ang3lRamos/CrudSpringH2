package com.example.crud.controller;

import com.example.crud.Service.StudentService;
import com.example.crud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping

    public List<Student> getAll(){
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")

    public Optional<Student> getBId(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }

    @PostMapping

    public Student saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
        return student;
    }

    @DeleteMapping("/{studentId}")

    public void saveUpdate(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }
}
