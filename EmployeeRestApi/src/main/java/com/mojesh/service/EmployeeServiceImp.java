package com.mojesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.mojesh.model.EmployeeRestApi;
import com.mojesh.repo.EmployeeRepo;

public abstract class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;

	@Override
	public EmployeeRestApi saveEmployee(EmployeeRestApi emp) {
		EmployeeRestApi e1=repo.save(emp);
		return e1;
	}
	@Override
	public void deleteEmployee(Integer eid) {
		repo.deleteById(eid);
	}
	@Override
	public EmployeeRestApi getOneEmployee(@PathVariable Integer eid) {
		EmployeeRestApi e2=repo.findById(eid).get();
		return e2;
		
	}
}
