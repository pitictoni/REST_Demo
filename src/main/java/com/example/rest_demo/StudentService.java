package com.example.rest_demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ArrayList<Student> getAllStudents(){
        return (ArrayList<Student>) studentRepository.findAll();
    }
}
