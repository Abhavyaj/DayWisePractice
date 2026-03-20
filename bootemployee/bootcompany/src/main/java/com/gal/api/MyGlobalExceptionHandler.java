package com.gal.api;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class MyGlobalExceptionHandler {
	private static final Logger log = LoggerFactory.getLogger(MyGlobalExceptionHandler.class);
	// Handle specific exception
	@ExceptionHandler(exception =DepartmentNotFoundException.class)
	public ResponseEntity<Map<String, String>> returnDepartmentNotFoundException(DepartmentNotFoundException e) {
		log.error("Exception is {}", e);
		Map<String, String> map = new HashMap<>();
		map.put("message", e.getMessage());
		map.put("code", HttpStatus.NOT_FOUND.toString());

		ResponseEntity<Map<String, String>> re = ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

		return re;
	}

	// Handle all other exceptions
	@ExceptionHandler(exception = Exception.class)
	public ResponseEntity<Map<String, String>> getExceptionDetailsRE(Exception e) {

		log.error("Handling all exceptions in Department Controller");

		Map<String, String> map = new HashMap<>();
		map.put("message", e.getMessage());
		map.put("code", HttpStatus.BAD_REQUEST.toString());

		ResponseEntity<Map<String, String>> re = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);

		return re;
	}
}