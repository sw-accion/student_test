package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "poc_student_test")
@Builder
@Data
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "role_number")
	private int roleNumber;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_age")
	private int studentAge;

	@Column(name = "gender")
	private String gender;

	@Tolerate
	protected Student(){

	}



}