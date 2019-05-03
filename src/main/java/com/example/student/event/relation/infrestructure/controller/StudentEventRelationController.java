package com.example.student.event.relation.infrestructure.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import com.example.student.event.relation.domain.model.Student;
import com.example.student.event.relation.domain.service.StudentEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student-event-relation")
public class StudentEventRelationController {
    
    private StudentEventService studentEventService;

    @Autowired
    public StudentEventRelationController(StudentEventService studentEventService) {
        this.studentEventService = studentEventService;
    }
    
    @PostMapping("/student/id/{id}")
    public ResponseEntity<Student> getStudentEventRelation(@PathVariable("id") String id) {
        Student student = studentEventService.getStudentById(id);
        return (student == null) ? new ResponseEntity<>(student, NOT_FOUND) : new ResponseEntity<>(student, OK);
    }
    
}
