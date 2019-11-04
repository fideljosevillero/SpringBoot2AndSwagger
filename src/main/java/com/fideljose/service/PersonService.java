package com.fideljose.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fideljose.model.Person;
import com.fideljose.repository.IPersonRepository;

@Service
public class PersonService implements IPersonService {

	@Autowired
	IPersonRepository repo;
	
	@Override
//	public List<Person> getPeople() {
	public Person getPeople() {
		Person p1 = new Person("firstName1--", "lastName1--", "address1--", "city1--");
//		Person p2 = new Person("firstName2", "lastName2", "address2", "city2");
//		Person p3 = new Person("firstName3", "lastName3", "address3", "city3");
//		List<Person> list = new ArrayList<Person>();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);

//		return list;		
		
		return repo.save(p1);
	}
	
	@Override
	public Optional<Person> findPerson(Integer idPerson) {
		Optional<Person> p = repo.findById(idPerson);
		return p;
	}

}
