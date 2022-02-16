package com.cg.mts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Theaters;

@Repository
public interface ITheatersRepository extends CrudRepository<Theaters, Integer> {

}
