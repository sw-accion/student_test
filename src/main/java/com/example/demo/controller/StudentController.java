package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	public StudentService studentService;

	@GetMapping("/details")
	public List<Student> get(){
		System.out.println ("Getmapping for Student Api");
		List<Student>  studentList = studentService.getStudents();
		return studentList;
	}

	@PostMapping
	public Student save(@RequestBody Student std){
		System.out.println ("Postmapping for Student Api");
		return studentService.save(std);
	}


	@PutMapping
	public Student update(@RequestBody Student std){
		return studentService.update(std);
	}

	@DeleteMapping
	public void delete(@RequestParam("id") Long id){
		System.out.println ("DeleteMapping for Student Api");
		studentService.delete (id);
	}

}
