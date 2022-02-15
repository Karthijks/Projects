package com.master.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.entity.StudentEntity;
import com.master.service.StudentService;

@RestController
public class StudentController {

	private final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	@PostMapping("/student/poststudent")
	public StudentEntity addStudent(@Valid @RequestBody StudentEntity student) {
		LOGGER.info("Inside STudentController addStudent method, RequestBody : {} ", student);
		return studentService.addStudent(student);
	}

	@GetMapping("/student/getstudentall")
	public List<StudentEntity> getAllStudent() {
		return studentService.getAllStudent();
	}

	@GetMapping("/student/{student-id}")
	public StudentEntity getStudentById(@PathVariable("student-id") Integer id) {
		return studentService.getStudentById(id);
	}
}
