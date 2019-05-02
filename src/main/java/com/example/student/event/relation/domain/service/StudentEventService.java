package com.example.student.event.relation.domain.service;

import com.example.student.event.relation.domain.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentEventService {
    
    private StudentService studentService;
    private EventService eventService;

    @Autowired
    public StudentEventService(StudentService studentService, EventService eventService) {
        this.studentService = studentService;
        this.eventService = eventService;
    }
    
    public Student getStudentById(String id) {
        return studentService.getStudentById(id);
    }
    
}
