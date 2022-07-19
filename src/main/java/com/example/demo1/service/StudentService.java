package com.example.demo1.service;

import java.util.List;

import com.example.demo1.model.Student;

public interface StudentService {

	List<Student> getStudentByCity(String city);
	List<Student> getAllStudents();
}
