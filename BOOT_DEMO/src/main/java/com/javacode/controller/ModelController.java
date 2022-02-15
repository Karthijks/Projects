package com.javacode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javacode.entity.CrudModel;
import com.javacode.service.ModelService;

@RestController
public class ModelController {
	
	@Autowired
	ModelService modelService;
	
	@PostMapping("/crudcreate")
	private CrudModel createcrud(@RequestBody CrudModel cd) {
		return modelService.createcrud(cd);
	}
	
	@DeleteMapping("/cruddelete/{aaa}")
	private void deletecrud(@PathVariable ("aaa") int id) {
		modelService.deletecrud(id);
	}
	
	@GetMapping("/crudfindid/{aaa}")
	private CrudModel findbyidcrud(@PathVariable ("aaa") int id) {
		return modelService.findbyidcrud(id);
	}
	
	@GetMapping("/findallcruds")
	private List<CrudModel> findallcrud(){
		return modelService.findallcrud();
	}

}
