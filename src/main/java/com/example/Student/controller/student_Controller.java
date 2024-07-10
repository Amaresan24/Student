package com.example.Student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Student.CustomExce.AgeException;
import com.example.Student.CustomExce.IdNotFoundException;
import com.example.Student.CustomExce.NameNotFoundException;
import com.example.Student.entity.Student;
import com.example.Student.sevice.student_service;
import java.util.*;

@RestController
public class student_Controller {

	@Autowired
	student_service ss;

	@PostMapping(value = "/post_student")
	public String getdetail(@RequestBody Student a) throws AgeException {
		return ss.getdetail(a);
	}

	@PostMapping(value = "/post_all")
	public String postdetail(@RequestBody List<Student> a) {
		return ss.postdetail(a);
	}

	@GetMapping(value = "/get_student_byId/{a}")
	public Student getStudentId(@PathVariable int a) throws IdNotFoundException {
		return ss.getStudentId(a);
	}

	@GetMapping(value = "/getall_student")
	public List<Student> getallStudent() {
		return ss.getallStudent();
	}

	@GetMapping(value = "/getname_match/{a}")
	public List<Student> getMatch_student(@PathVariable String a) throws NameNotFoundException {
		return ss.getMatch_student(a);

	}

	/// --------------Exception ___handler ----------------->

}
