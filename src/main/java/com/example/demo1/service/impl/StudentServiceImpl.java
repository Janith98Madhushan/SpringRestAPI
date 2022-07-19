package com.example.demo1.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo1.model.Student;
import com.example.demo1.repository.StudentRepository;
import com.example.demo1.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	//@Autowired
	private StudentRepository studentRepository;
	
	

	//@Override
	//public List<Student> getStudentByCity(String city) {
		//List<Student> studentList = new ArrayList<>();
		//studentList.add(new Student("CS/2018/004","Ashaka","Hambanthota"));
		//studentList.add(new Student("CS/2018/005","Harshika","Rathnapura"));
		//studentList.add(new Student("CS/2018/003","Nadun","Colombo"));
		//studentList.add(new Student("CS/2018/010","Gayasha","Galle"));
		//studentList.add(new Student("CS/2018/007","Udara","Colombo"));
		
		//return studentList.stream().filter(student -> student.getCity().equals(city)).collect(Collectors.toList());
	//}

	@Override
    public List<Student> getStudentByCity(String city) {
        return studentRepository.findStudentByCity(city);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
