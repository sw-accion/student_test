package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

	@Autowired
	public IStudentRepo studentRepo;



	public List<Student> getStudents () {
		return studentRepo.findAll();
	}

	public void delete (Long id) {
		studentRepo.deleteById (id);
	}

	public Student update (Student std) {
		Optional<Student> student = studentRepo.findById (std.getId ());
		Student student1 = student.get ();
		Student student2 = Student.builder ()
			.studentAge (student1.getStudentAge ())
			.studentName (student1.getStudentName ())
			.gender (student1.getGender ())
			.roleNumber (student1.getRoleNumber ())
			.build ();
		return  studentRepo.save (student2);
	}

	public Student save (Student std) {
		Student student = Student.builder ()
			.gender (std.getGender ())
			.roleNumber (std.getRoleNumber ())
			.studentAge (std.getStudentAge ())
			.studentName (std.getStudentName ())
			.build ();
		return studentRepo.save (student);
	}
}
