package com.mojesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mojesh.model.EmployeeRestApi;

import com.mojesh.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public EmployeeRestApi saveEmp(@RequestBody EmployeeRestApi emp) {
		EmployeeRestApi emp1=service.saveEmployee(emp);
		return emp1;
	}
	@DeleteMapping("/delete/{eid}")
	public void deleteEmp(@PathVariable Integer eid) {
			service.deleteEmployee(eid);
	}
	@GetMapping("/get/{eid}")
	public EmployeeRestApi getOneRecord(@PathVariable Integer eid) {
		EmployeeRestApi emp2=service.getOneEmployee(eid);
		return emp2;
	}
	
}
