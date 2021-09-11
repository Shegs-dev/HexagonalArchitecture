/**
 * 
 */
package com.baeldung.hexagonal.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author OluwasegunAjayi on 11th September 2021
 *
 */
@Entity 
public class User { 
	
	@Id 
	private String id; 
	private String firstname; 
	private String lastname; 
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
}
