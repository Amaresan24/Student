package com.example.Student.CustomExce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> AgeNot_match(AgeException e) {
		return new ResponseEntity<Object>("---Gobel --Exception --Your is Age Not Match--->", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> NameNot_match(NameNotFoundException name) {
		return new ResponseEntity<Object>("---Gobel --Exception --Your is Name Not Match--->", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> IDNot_match(IdNotFoundException id) {
		return new ResponseEntity<Object>("---Gobel --Exception --Your is id  Not Match--->", HttpStatus.BAD_REQUEST);
	}

}
