package com.cg.mts.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.mts.entities.Events;
import com.cg.mts.repository.IEventsRepository;

@SpringBootTest

class EventsServiceImplTest {

	@Mock
    IEventsRepository repository;
	@Test
	void testViewEvents() {
		Events actualEvent = new Events();
        Optional<Events> output = Optional.of(actualEvent); 
        when((repository.findById(101))).thenReturn(output);
        assertEquals(new Events(), actualEvent);
	}

	@Test
	void testViewAllEvents() {
		 List<Events> actualOutput = new ArrayList<>();

	        when(repository.findAll()).thenReturn(actualOutput);
	        // verify
	        assertIterableEquals(new ArrayList<Events>(), actualOutput);
	}

}
