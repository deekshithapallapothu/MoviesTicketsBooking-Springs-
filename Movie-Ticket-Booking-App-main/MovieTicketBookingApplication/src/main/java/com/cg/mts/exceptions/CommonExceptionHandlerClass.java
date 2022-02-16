package com.cg.mts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandlerClass {

	@ExceptionHandler
	public ResponseEntity<ErrorTemplate> handlerForEventDurationException(InvalidEventDurationException exp)
	{
		ErrorTemplate template = new ErrorTemplate();
		template.setErrorMsg(exp.toString());
		template.setActionType("Invalid Event Duration");
		return new ResponseEntity<ErrorTemplate>(template,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorTemplate> handlerForMovieDurationException(InvalidMovieDurationException exp)
	{
		ErrorTemplate template = new ErrorTemplate();
		template.setErrorMsg(exp.toString());
		template.setActionType("Invalid Movie Duration");
		return new ResponseEntity<ErrorTemplate>(template,HttpStatus.BAD_REQUEST);
	}
}
