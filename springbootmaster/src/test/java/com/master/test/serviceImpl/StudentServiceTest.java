package com.master.test.serviceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.master.entity.StudentEntity;
import com.master.repository.StudentRepository;
import com.master.service.StudentService;

@SpringBootTest
class StudentServiceTest {

	@Autowired
	StudentService studentService;

	@MockBean
	private StudentRepository studentRepository;

	@BeforeEach
	void setup() {
		Optional<StudentEntity> student = Optional.of(new StudentEntity(1, "abc", 100, "dlh"));
		Mockito.when(studentRepository.findById(1)).thenReturn(student);
	}

	@Test
	public void testGetStudentById() {
		String student_name = "abc";
		StudentEntity student = studentService.getStudentById(1);
		assertEquals(student_name, student.getName());
	}

}
