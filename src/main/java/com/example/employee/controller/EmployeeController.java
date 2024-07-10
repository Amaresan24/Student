package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.employee.enity.Employee;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {

@Autowired // tranfer to one class  to anthor class
EmployeeService es;	
/////    <------------------------------- set the data is kown as post the data-------------->
@PostMapping(value = "/obj1")
public String postEmp(@RequestBody Employee e) {
return es.postEmp(e);
}
///<------------------------- get the data in id wise in database ------------------------>
@GetMapping(value = "/getdetails_id/{a}")
public Employee getByEmp(@PathVariable int a) {
	return es.getByEmp(a);
}	
///// <---------------------------------get the  full list of data-------------->
@GetMapping(value = "/getfull_list")
public List<Employee>getfullEmp(){
	return es.getfullEmp();
}

////<----------------------------------------update the data in Id Wise -------------------->

@PutMapping(value = "/Updatedetails_id/{a}")
public String  updateEmp(@RequestBody Employee e, @PathVariable int a ) {
return es.updateEmp(e, a);
}


///// <---------------------------------Delete  the  data in id wise  list of data-------------->
@DeleteMapping(value = "/delete_id/{a}")
public String deleteByEmp(@PathVariable int a) {
	return es.deleteByEmp(a);
}

}



