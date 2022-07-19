package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Student;
import com.example.demo1.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student-data")
	public ResponseEntity<List<Student>> studentListData(){
		return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
	}
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/student-details")
	public ResponseEntity<List<Student>> studentDetails(@RequestParam String city) {
		
		List<Student> studentList = studentService.getStudentByCity(city);
		
		if(studentList.isEmpty()) {
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
			
		}
		
		return new ResponseEntity<>(studentList,HttpStatus.OK);
	}
	
	@GetMapping("/student-list")
	public ResponseEntity<List<Student>> studentList(){
		return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
	}
}
