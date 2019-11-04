package com.fideljose.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Persona")
public class Person implements Serializable {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer Id;
	
	@ApiModelProperty(notes = "Primer nombre")
	private String firstName;
	@ApiModelProperty(notes = "Segundo nombre")
	private String lastName;
	@ApiModelProperty(notes = "Direccion")
	private String address;
	@ApiModelProperty(notes = "Ciudad")
	private String city;
	
	public Person() {
		super();
	}	
	public Person(String firstName, String lastName, String address, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
