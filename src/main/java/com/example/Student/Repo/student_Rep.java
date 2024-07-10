package com.example.Student.Repo;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Student.entity.Student;


public interface student_Rep extends JpaRepository<Student, Integer> {



}
