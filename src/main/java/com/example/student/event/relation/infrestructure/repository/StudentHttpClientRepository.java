package com.example.student.event.relation.infrestructure.repository;

import static org.springframework.http.HttpMethod.GET;

import com.example.student.event.relation.domain.model.Student;
import com.example.student.event.relation.domain.repository.StudentRepository;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class StudentHttpClientRepository implements StudentRepository{
    
    private RestTemplate restTemplate;

    @Autowired
    public StudentHttpClientRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Student getStudentById(String id) {
        ResponseEntity<Student> res = restTemplate.exchange(buildStudentIsRequest(id), Student.class);
        return res.getBody();
    }
    
    private RequestEntity<String> buildStudentIsRequest(String id) {
        return new RequestEntity<>(GET, buildURI(id));
    }
    
    private URI buildURI(String id) {
        String uri = new StringBuilder().append("localhost:8080/")
                .append("student/boleta/")
                .append(id)
                .toString();
        return URI.create(uri);
    }
    
}
