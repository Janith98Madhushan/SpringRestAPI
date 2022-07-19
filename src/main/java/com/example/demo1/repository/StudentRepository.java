package com.example.demo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo1.model.Student;


public interface StudentRepository extends JpaRepository<Student,Long> {

	List<Student> findStudentByCity(String city);
}
