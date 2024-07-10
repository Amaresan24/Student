package com.example.employee.EmpRespository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employee.enity.Employee;
import com.example.employee.respositry.EmployeeRepository;
@Repository

public class EmployeeRep {
@Autowired
EmployeeRepository  er;
/////<------------------------------- set the data is know as post the data- and return message  successfully------->

public String postEmp(Employee e) {
	// TODO Auto-generated method stub
	er.save(e);
	return "Sucessfully added in your data base";
}
///<------------------------- get the data in id wise in database ------------------------>

public Employee getByEmp(int a) {
	// TODO Auto-generated method stub
	return er.findById(a).get();
}
//// <--------------------------------get full data list in data base------------------------------------>
public List<Employee> getfullEmp() {
	// TODO Auto-generated method stub
	return er.findAll();
}

////<----------------------------------------update the data in Id Wise -------------------->
public Employee getUpdate(int a) {
	return er.findById(a).get();    //// ------------> its is optional 
	
}

public String updateEmp(Employee e ) {
er.save(e);
return "  <----------Update SuccesFully -----!!-->";
}


///// <---------------------------------Delete  the  full list of data-------------->

public String deleteByEmp(int a) {
	// TODO Auto-generated method stub
	er.deleteById(a);
	return "deleted successfully in your id ";
}



}
