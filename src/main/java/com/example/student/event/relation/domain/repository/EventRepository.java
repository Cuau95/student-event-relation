package com.example.student.event.relation.domain.repository;

import com.example.student.event.relation.domain.model.Event;

public interface EventRepository {
    
    public Event getEventById(String id);
    
}
