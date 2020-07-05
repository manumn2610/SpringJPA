package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public Person(int id, String name, String location, Date birthDate) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [\nid=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	private String location;
	private Date birthDate;

}
