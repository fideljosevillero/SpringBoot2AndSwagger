package com.fideljose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fideljose.model.Person;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Integer> {
	
}
