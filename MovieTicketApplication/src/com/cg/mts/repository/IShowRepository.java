package com.cg.mts.repository;

import java.time.LocalDate;
import java.util.List;

import com.cg.mts.entities.Show;
import com.cg.mts.exception.ShowNotFoundException;

public interface IShowRepository {

	public Show addShow(Show show);
	public Show updateShow(Show show) throws ShowNotFoundException;
	public Show removeShow(int showid) throws ShowNotFoundException;
	public Show viewShow(int showid) throws ShowNotFoundException;
	public List<Show> viewAllShows();
	public List<Show> viewShowList(int theatreid)throws ShowNotFoundException;
	public List<Show> viewShowList(LocalDate date)throws ShowNotFoundException;
}
