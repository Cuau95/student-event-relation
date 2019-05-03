package com.example.student.event.relation.domain.service;

import com.example.student.event.relation.domain.model.Event;
import com.example.student.event.relation.domain.model.Student;
import com.example.student.event.relation.domain.model.StudentEventRelation;
import com.example.student.event.relation.domain.model.StudentEventRelationEntity;
import com.example.student.event.relation.domain.repository.StudentEventRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentEventRelationService {
    
    private StudentService studentService;
    private EventService eventService;
    private StudentEventRelationRepository studentEventRelationRepository;

    @Autowired
    public StudentEventRelationService(StudentService studentService, EventService eventService, StudentEventRelationRepository studentEventRelationRepository) {
        this.studentService = studentService;
        this.eventService = eventService;
        this.studentEventRelationRepository = studentEventRelationRepository;
    }
    
    public StudentEventRelation saveStudentEventRelation(String idStudent, String idEvent) {
        Student student = getStudentById(idStudent);
        Event event = getEventById(idEvent);
        StudentEventRelation studentEventRealtion = buildStudentEventRelation(student, event);
        if(student == null || event == null){
            return studentEventRealtion;
        } else {
            studentEventRealtion.setIdEventoAlumno(saveStudentEventRelationEntity(student, event).getIdEventoAlumno());
            return studentEventRealtion;
        }
    }
    
    private StudentEventRelation buildStudentEventRelation(Student student, Event event) {
        StudentEventRelation studentEventRealtion = new StudentEventRelation();
        studentEventRealtion.setAlumno(student);
        studentEventRealtion.setEventoFeriaEmpleo(event);
        return studentEventRealtion;
    }
    
    private StudentEventRelationEntity saveStudentEventRelationEntity(Student student, Event event) {
        StudentEventRelationEntity studentEventRelatinEntity = new StudentEventRelationEntity();
        studentEventRelatinEntity.setEventoFeriaEmpleo(event.getIdEvento());
        studentEventRelatinEntity.setAlumno(student.getId());
        return studentEventRelationRepository.save(studentEventRelatinEntity);
    }
    
    private Student getStudentById(String id) {
        return studentService.getStudentById(id);
    }
    
    private Event getEventById(String id) {
        return eventService.getEventById(id);
    }
    
}
