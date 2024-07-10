package com.example.employee.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.employee.EmpRespository.EmployeeRep;
import com.example.employee.enity.Employee;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRep er;
	
 /////    <------------------------------- set the data in  database is know as post the data-------->
public String postEmp(Employee e) {
		return er.postEmp(e);
	}
	///        <------------------------- get the data in id wise in database ------------------------>
public Employee getByEmp(@PathVariable int a) {
		return er.getByEmp(a);
	}
  ////           <--------------------------------get full data list in database---------->
public List<Employee> getfullEmp() {
		return er.getfullEmp();
	}

////<----------------------------------------update the data in Id Wise -------------------->

public String updateEmp(Employee e  , int id) {
Employee val = er.getByEmp(id);
val.setName(e.getName());
val.setGender(e.getGender());
er.updateEmp(val);

return "  <----------Update SuccesFully -----!!-->";

}

///// <---------------------------------Delete  the  full list of data-------------->


public String deleteByEmp(int a) {
	// TODO Auto-generated method stub
	return er.deleteByEmp(a);
}
	

	

}
