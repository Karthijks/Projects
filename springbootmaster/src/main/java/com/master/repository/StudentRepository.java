package com.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	// @Query("select c from Contact c where c.email like %?1")
	// List<Contact> findByNameEndwithMailId(String mailid);
}
