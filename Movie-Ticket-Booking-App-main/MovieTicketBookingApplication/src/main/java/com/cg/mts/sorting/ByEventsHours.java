package com.cg.mts.sorting;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import com.cg.mts.entities.Events;

@Component
public class ByEventsHours implements Comparator<Events> {

	public int compare(Events o1,Events o2) {
	return o2.getEventHours()-o1.getEventHours();
	}
}