package com.master.test.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.master.entity.StudentEntity;
import com.master.repository.StudentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private TestEntityManager entityManager;

	@BeforeEach
	void setup() {
		StudentEntity studentEntity = new StudentEntity(44, "karthi", 9999, "dlh");
		entityManager.persist(studentEntity);
	}

	@Test
	public void findByStudentId() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals("karthi", student.getName());
	}

}
