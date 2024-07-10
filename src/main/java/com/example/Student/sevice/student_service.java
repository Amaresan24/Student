package com.example.Student.sevice;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Student.CustomExce.AgeException;
import com.example.Student.CustomExce.IdNotFoundException;
import com.example.Student.CustomExce.NameNotFoundException;
import com.example.Student.dao.student_dao;
import com.example.Student.entity.Student;

@Service
public class student_service {
	@Autowired
	student_dao sd;

	public String getdetail(Student a) throws AgeException {

		// try {
		if (a.getAge() > 18) {
			return sd.getdetail(a);
		} else {
			throw new AgeException("<-----------------Your Age is Not eligible for voting---------> ");
		}

		// } catch (Exception e) {

		 //e.getMessage();
		 //return "<-------------!-----@-----Your age is notEligiable---!----!--------->";
		// }
	}

	public String postdetail(List<Student> a) {
		// TODO Auto-generated method stub
		return sd.postdetail(a);
	}

	/// ---> is your return in orElseThrow means return type is Student
	/// --> is your retrun empty means return type is List<Student>
	public Student getStudentId(int a) throws IdNotFoundException {
		// TODO Auto-generated method stub
		List<Student> Sm = getallStudent();
		// List<Student> ids = Sm.stream().filter(X -> X.getId() == a).toList();

		// if (ids.isEmpty()) {
		// throw new IdNotFoundException("<---------given id is InValid----------->");

		// } else {
		// return ids;

		// }
		return Sm.stream().filter(X -> X.getId() == a).findFirst()
				.orElseThrow(() -> new IdNotFoundException("<----given id is InValid------->" + a));
	}

	public List<Student> getallStudent() {
		// TODO Auto-generated method stub
		return sd.getallStudent();
	}

	
	/// -------------------<Is using in throws in keyWords---------------------->
	public List<Student> getMatch_student(String a) throws NameNotFoundException {
		// TODO Auto-generated method stub
		List<Student> li = getallStudent();
		List<Student> names = li.stream().filter(X -> X.getName().equals(a)).collect(Collectors.toList());

		if (names.isEmpty()) {
			throw new NameNotFoundException("<------------Given name is not found in our database----------->");
		} else {

			return names;
		}

	}

}



