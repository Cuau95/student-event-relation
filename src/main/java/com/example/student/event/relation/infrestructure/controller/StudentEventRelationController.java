package com.example.student.event.relation.infrestructure.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import com.example.student.event.relation.domain.model.StudentEventRelation;
import com.example.student.event.relation.domain.service.StudentEventRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student-event-relation")
public class StudentEventRelationController {
    
    private StudentEventRelationService studentEventService;

    @Autowired
    public StudentEventRelationController(StudentEventRelationService studentEventService) {
        this.studentEventService = studentEventService;
    }
    
    @PostMapping("/student/id/{idStudent}/event/id/{idEvent}")
    public ResponseEntity<StudentEventRelation> getStudentEventRelation(
            @PathVariable("idStudent") String idStudent, @PathVariable("idEvent") String idEvent
    ) {
        StudentEventRelation studentEventRelation = studentEventService.saveStudentEventRelation(idStudent, idEvent);
        HttpStatus status = OK;
        if(studentEventRelation.getAlumno() == null || studentEventRelation.getEventoFeriaEmpleo() == null){
            status = NOT_FOUND;
        }
        return new ResponseEntity<>(studentEventRelation, status);
    }
    
}
