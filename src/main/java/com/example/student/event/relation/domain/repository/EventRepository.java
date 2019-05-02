package com.example.student.event.relation.domain.repository;

import com.example.student.event.relation.domain.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository {
    
    public Event getEventById();
    
}
