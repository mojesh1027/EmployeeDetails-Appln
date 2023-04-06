package com.mojesh.service;

import com.mojesh.model.EmployeeRestApi;
import java.util.*;

public interface EmployeeService {
		public EmployeeRestApi saveEmployee(EmployeeRestApi emp);
		public EmployeeRestApi  updateEmployee(EmployeeRestApi emp,Integer eid);
		public void  deleteEmployee(Integer eid);
		public EmployeeRestApi  getOneEmployee(Integer eid);
		public List<EmployeeRestApi>  getAllEmployee();
}
