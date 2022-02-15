package com.javacode.repository;

import org.springframework.data.repository.CrudRepository;

import com.javacode.entity.CrudModel;

public interface ModelRepository extends CrudRepository<CrudModel, Integer> {

}
