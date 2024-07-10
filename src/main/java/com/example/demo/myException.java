package com.example.demo;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class myException {
@ExceptionHandler(NoSuchElementException.class)
public ResponseEntity<String> ex()
{
	return new ResponseEntity<String>("resourse not avilabe", HttpStatus.BAD_REQUEST);
}
}
