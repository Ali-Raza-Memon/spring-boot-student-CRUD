package com.iba.student.controller;

import com.iba.student.model.Student;
import com.iba.student.repository.StudentRepository;
import com.iba.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    public StudentService service;


    @GetMapping("/infoStudents")
    public List<Student> getInfo(){
        return service.getStudents();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }


    @DeleteMapping("/delete/{id}")
    public String delelteById(@PathVariable int id){
        return service.deleteById(id);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }



}
