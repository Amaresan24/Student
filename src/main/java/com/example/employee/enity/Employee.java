package com.example.employee.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "employee_details")
@Entity // identify the intial class
public class Employee {

	@Id // perimary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // automatic conf ids
	private int id;
	private String name;
	private String gender;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
