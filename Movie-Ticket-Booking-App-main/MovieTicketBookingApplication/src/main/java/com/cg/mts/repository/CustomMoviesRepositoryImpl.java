package com.cg.mts.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Movies;
import com.cg.mts.entities.Theaters;

@Repository
public class CustomMoviesRepositoryImpl implements CustomMoviesRepository {
	
	
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Movies> getMoviesByLanguage(String movieLanguage,String theatreCity) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Movies m where m.movieLanguage=:movieLanguage";
		Query<Movies> query = session.createQuery(queryString);
		query.setString("movieLanguage", movieLanguage);
		
		List<Movies>  movies = (List<Movies>) query.getResultList();
		List<Movies> finalMovies = new ArrayList<Movies>();
		if(movies != null)
		{
			for (Movies movie : movies) {
				List<Theaters> theaters = movie.getTheaters();
				List<Theaters> locationTheaters = new ArrayList<Theaters>();
				for (Theaters theater : theaters) {
					String location = theater.getTheatreCity();
					if(location.equalsIgnoreCase(theatreCity))
					{
						locationTheaters.add(theater);
					}
				}
				if(locationTheaters.size()!=0)
				{
					movie.setTheaters(locationTheaters);
					finalMovies.add(movie);
				}
				
			}
			return finalMovies;
		}
		else
		{
			throw new javax.persistence.NoResultException("Movie Language is Not In The DB");
		}
	}

	@Override
	public Movies getMoviesByName(String movieName,String theatreCity) {
		
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from Movies m where m.movieName=:movieName";
		Query<Movies> query = session.createQuery(queryString);
		query.setString("movieName", movieName);
		
		Movies movies = (Movies) query.getSingleResult();
		
		if(movies!= null)
		{
			List<Theaters> theaters = movies.getTheaters();
			List<Theaters> locationTheaters = new ArrayList<Theaters>();
			for (Theaters theater : theaters) {
				String location = theater.getTheatreCity();
				if(location.equalsIgnoreCase(theatreCity))
				{
					locationTheaters.add(theater);
				}
			}
			if(locationTheaters.size()!=0)
			{
				movies.setTheaters(locationTheaters);
			}
			else
				throw new javax.persistence.NoResultException("Movie Name is Not In The current Location");
			//System.out.println(movies);
			return movies;
		}
		else
		{
			throw new javax.persistence.NoResultException("Movie Name is Not In The DB");
		}
		
	}

}