package com.cg.mts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.mts.entities.Theaters;
import com.cg.mts.service.ITheatersService;

@RestController
@RequestMapping("/app")
public class TheatersWebController {

	@Autowired
	ITheatersService service;
	
	@PostMapping("/theater")
	public boolean createTheater(@RequestBody Theaters t)
	{
		service.createTheater(t);
		return true;
	}
	@GetMapping("/theater/{theaterId}")
	public Theaters getCustomerId(@PathVariable int theaterId)
	{
		return service.getTheaterById(theaterId);
	}
	@DeleteMapping("/theater/{theaterId}")
	public boolean removeTheaterById(@PathVariable int theaterId) {
		return service.removeTheaterById(theaterId);
	}
	@GetMapping("/theaters")
	public List<Theaters> getAllTheaters()
	{
		return service.getAllTheaters();
	}
}
