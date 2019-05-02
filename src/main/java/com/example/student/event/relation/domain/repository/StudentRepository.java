package com.example.student.event.relation.domain.repository;

import com.example.student.event.relation.domain.model.Student;

public interface StudentRepository {
    
    public Student getStudentById(String id);
    
}
