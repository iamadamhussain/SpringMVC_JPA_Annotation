package com.xworkz.app.service;

import java.util.List;

import com.xworkz.app.dto.Employee;

public interface EmployeeService {
	public Employee save(Employee employee);
	public List<Employee> searchByEmployeeFirstName(String firstname);
}
