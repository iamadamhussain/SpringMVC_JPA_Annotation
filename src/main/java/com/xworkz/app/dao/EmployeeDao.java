package com.xworkz.app.dao;

import java.util.List;

import com.xworkz.app.dto.Employee;

public interface EmployeeDao {
	
	public Employee save(Employee employee);
	public List<Employee> searchByEmployeeFirstName(String firstname);


}
