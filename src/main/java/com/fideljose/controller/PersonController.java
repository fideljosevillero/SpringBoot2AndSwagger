package com.fideljose.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fideljose.model.Person;
import com.fideljose.service.IPersonService;

@RestController
@RequestMapping(value="/api")
public class PersonController implements InitializingBean, DisposableBean {

	@Autowired
	IPersonService personService;
	
	@GetMapping("/")
//	public ResponseEntity<List<Person>> test() {
	public Optional<Person> test() {
//		Person p1 = new Person("firstName", "lastName", "address", "city");
//		Person p2 = new Person("firstName", "lastName", "address", "city");
//		Person p3 = new Person("firstName", "lastName", "address", "city");
//		List<Person> list = new ArrayList<Person>();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
		personService.getPeople();
//		List<Person> list = personService.getPeople();
//		return new ResponseEntity<List<Person>>(list, HttpStatus.OK);
		return personService.findPerson(1);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("METOD afterPropertiesSet!!!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("METOD destroy!!!");
	}
	
	@GetMapping("/get/{id}")
	public Optional<Person> getPerson(@PathVariable Integer id){
		return personService.findPerson(id);
	}
	
//	@PostMapping("/create")
//	public ResponseEntity<String> create(@PathParameters){
//		
//	}
	
	
}