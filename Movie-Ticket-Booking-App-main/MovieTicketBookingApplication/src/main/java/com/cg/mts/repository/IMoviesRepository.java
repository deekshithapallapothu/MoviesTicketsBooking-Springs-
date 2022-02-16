package com.cg.mts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Movies;
@Repository
public interface IMoviesRepository extends CrudRepository<Movies, Integer>, CustomMoviesRepository
{

}