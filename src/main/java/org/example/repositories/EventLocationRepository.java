package org.example.repositories;

import org.example.entity.EventLocationMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventLocationRepository extends CrudRepository<EventLocationMapping,Integer> {
    List<EventLocationMapping> findAll();
}
