package com.cg.mts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Events;
@Repository
public interface IEventsRepository extends CrudRepository<Events, Integer>, CustomEventsRepository{

}
