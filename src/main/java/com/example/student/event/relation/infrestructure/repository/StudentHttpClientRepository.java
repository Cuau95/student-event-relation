package com.example.student.event.relation.infrestructure.repository;

import static org.springframework.http.HttpMethod.GET;

import com.example.student.event.relation.domain.model.Student;
import com.example.student.event.relation.domain.repository.StudentRepository;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Repository
public class StudentHttpClientRepository implements StudentRepository {

    private final RestTemplate restTemplate;

    @Autowired
    public StudentHttpClientRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Student getStudentById(String id) {
        try {
            ResponseEntity<Student> res = restTemplate.exchange(buildStudentIsRequest(id), Student.class);
            return res.getBody();
        } catch (RestClientException ex) {
            return null;
        }
    }

    private RequestEntity<String> buildStudentIsRequest(String id) {
        return new RequestEntity<>(GET, buildURI(id));
    }

    private URI buildURI(String id) {
        String uri = new StringBuilder().append("http://localhost:8085/")
                .append("student/boleta/")
                .append(id)
                .toString();
        return URI.create(uri);
    }

}
