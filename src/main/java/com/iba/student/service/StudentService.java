package com.iba.student.service;

import com.iba.student.model.Student;
import com.iba.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepository repo;

    public List<Student> getStudents(){
        return repo.findAll();
    }


    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    public String deleteById(int id) {
         repo.deleteById(id);
         return "student removed"+id;
    }

    public Student updateStudent(Student student) {
        Student std = repo.findById(student.getId()).orElse(null);
        std.setFirst_name(student.getFirst_name());
        std.setLast_name(student.getLast_name());
        std.setCMSId(student.getCMSId());
        std.setGender(student.getGender());
        std.setSemester(student.getSemester());
        return repo.save(std);
    }
}
