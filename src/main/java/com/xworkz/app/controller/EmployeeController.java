package com.xworkz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.dto.Employee;
import com.xworkz.app.service.EmployeeService;

@Controller
public class EmployeeController {
	public EmployeeController() {
		System.out.println("------EmployeeController------------");
	}

	@Autowired
	EmployeeService service;

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		System.out.println("-----saveEmployee----------" + this.getClass());
		Employee employee2 = service.save(employee);
		System.out.println("-----saved ----------" + employee2.getId());

		return new ModelAndView("welcome");
	}
	// @RequestMapping will get action name(url from UIpage)
	// RequestMethod POST post type request
	// @ModelAttribute will bind UI(form) data to Entity Class(Employee.java)
	// ModelAndView is class that holds information
	// of both UI and MOdel(that is Employee data)
	@RequestMapping("/searchname")
	public ModelAndView searchName(@RequestParam String firstname) {
		//@ModelAttribute will bind ui object to entity object
		System.out.println("-------searchName------1----"+firstname);

	List<Employee> lists=	service.searchByEmployeeFirstName(firstname);
	
	
	return new ModelAndView("show", "employees", lists);
	}
}
