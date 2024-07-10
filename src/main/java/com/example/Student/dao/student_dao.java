package com.example.Student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Student.CustomExce.AgeException;
import com.example.Student.Repo.student_Rep;
import com.example.Student.entity.Student;

@Repository
public class student_dao {
	@Autowired
	student_Rep sr;

	public String getdetail(Student a) throws AgeException {
		sr.save(a);
		return " Data saved Sucess Fully in git ";
	}

	public String postdetail(List<Student> a) {
		// TODO Auto-generated method stub
		 sr.saveAll(a);
		 return " full data saved succesfully";
	}

	public Student getStudentId(int a) {
		// TODO Auto-generated method stub
		return  sr.findById(a).get();
	}

	public List<Student> getallStudent() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
