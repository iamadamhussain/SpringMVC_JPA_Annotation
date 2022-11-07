package com.xworkz.app.service;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.jdbc.ConnectionImpl;
import com.xworkz.app.dao.EmployeeDao;
import com.xworkz.app.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
public EmployeeServiceImpl() {
	System.out.println("------EmployeeServiceImpl------------");
}	
	
	@Autowired
	private EmployeeDao employeeDao;

	public Employee save(Employee employee) {
		
	
		System.out.println("-------save method :EmployeeServiceImpl---------");
		return employeeDao.save(employee);
	}

	public List<Employee> searchByEmployeeFirstName(String firstname) {
		System.out.println("-------searchByEmployeeFirstName method :EmployeeServiceImpl---------");

		return employeeDao.searchByEmployeeFirstName(firstname);
	}

}
