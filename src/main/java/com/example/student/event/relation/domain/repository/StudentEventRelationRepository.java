package com.example.student.event.relation.domain.repository;

import com.example.student.event.relation.domain.model.StudentEventRelationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentEventRelationRepository extends CrudRepository<StudentEventRelationEntity, Integer>{
    
}
