package com.project.feedback.customsort;

import java.util.Comparator;

import com.project.feedback.entity.Feedback;

public class ByDate implements Comparator<Feedback>{
	public int compare(Feedback o1, Feedback o2)
	{
		if( o1.getDate().compareTo(o2.getDate())==0)
			return 0;
		else if(o1.getDate().compareTo(o2.getDate())>1)
			return 1;
		else
			return -1;
		
	}
	

}