/**
 * 
 */
package com.baeldung.hexagonal.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.hexagonal.repositories.UserRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author OluwasegunAjayi on 11th September 2021
 *
 */
@CrossOrigin(origins = "*") 
@Tag(name = "User Endpoints", description = "These endpoints manages users") 
@RestController("userRestController") 
public class UserRestController { 
	
	@Autowired 
	private UserRepository userRepository; 
	
	@RequestMapping(value = "/users/getAll", method = RequestMethod.GET) 
	@Operation(description = "This Service gets all users") 
	public ResponseEntity<List<?>> gets() throws Exception { 
		System.out.println("API Call To Fetch All Users"); 
		
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK); 
	} 
}
