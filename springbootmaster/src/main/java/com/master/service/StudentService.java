package com.master.service;

import java.util.List;

import com.master.entity.StudentEntity;

public interface StudentService {

	StudentEntity addStudent(StudentEntity student);

	List<StudentEntity> getAllStudent();

	StudentEntity getStudentById(Integer id);

}
