package com.fideljose.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fideljose.model.Person;

@Service
public interface IPersonService{
	
	public Person getPeople();
	
	public Optional<Person> findPerson(Integer idPerson);
	
}
