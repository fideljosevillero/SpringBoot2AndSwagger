package com.fideljose.controller;

import java.util.Optional;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fideljose.model.Person;
import com.fideljose.service.IPersonService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//swagger url 'http://localhost:1717/v2/api-docs'
//http://localhost:1717/swagger-ui.html
//https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
@RestController
@RequestMapping(value="/api")
@Api(value = "Nombre descriptivo del Api en esta clase", description = "Controlador Persona")
public class PersonController implements InitializingBean, DisposableBean {

	@Autowired
	IPersonService personService;
	
//	@ApiResponses( code = 200, value = { @ApiResponse(code = 0, message = "") })
	@ApiOperation(value="Value Operation - Prueba!!!")
	@GetMapping("/")
	public Optional<Person> test() {
		personService.getPeople();
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
	
	@PostMapping("/response")
	public String response(@RequestBody String body) {
		return body+"---";
	}
	
//	@PostMapping("/create")
//	public ResponseEntity<String> create(@PathParameters){
//		
//	}
	
	
}
