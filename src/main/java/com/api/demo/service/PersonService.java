
package com.api.demo.service;

import  com.api.demo.entity.Person;
import java.util.List;
import java.util.Optional;

public interface PersonService {
	public List<Person> findByName(String name); 
	public Optional<Person> findById(Long id); 
	//public void changeName(Long id,Person person); 
	public Person save(Person person); 
	public List<Person> findAllPersons(); 
    public void deleteById(Long id);
}