package com.example.student.event.relation.domain.service;

import com.example.student.event.relation.domain.model.Student;
import com.example.student.event.relation.domain.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public Student getStudentById(String id) {
        return studentRepository.getStudentById(id);
    }
}
