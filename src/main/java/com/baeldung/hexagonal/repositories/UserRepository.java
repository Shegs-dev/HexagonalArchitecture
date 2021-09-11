/**
 * 
 */
package com.baeldung.hexagonal.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.baeldung.hexagonal.entities.User;

/**
 * @author OluwasegunAjayi on 11th September 2021
 *
 */
@Repository("userRepository") 
public interface UserRepository extends MongoRepository<User, String>{ 
	
}
