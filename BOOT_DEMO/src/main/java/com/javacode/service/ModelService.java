package com.javacode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacode.entity.CrudModel;
import com.javacode.repository.ModelRepository;
@Service
public class ModelService {
	
	@Autowired
	ModelRepository modelRepository;
	
	public CrudModel createcrud(CrudModel cd) {
		return modelRepository.save(cd);
	}
	
	public CrudModel updatecrud(CrudModel cd) {
		return modelRepository.save(cd);
	}
	
	public void deletecrud(int id) {
		modelRepository.deleteById(id);
	}
	
	public CrudModel findbyidcrud(int id) {
		return modelRepository.findById(id).get();
	}
	
	public List<CrudModel> findallcrud(){
		List<CrudModel> x=new ArrayList<>();
		modelRepository.findAll().forEach(y-> x.add(y));
		return x;
	}
	

}
