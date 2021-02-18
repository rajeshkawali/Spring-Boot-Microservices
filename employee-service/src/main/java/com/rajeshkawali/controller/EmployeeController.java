package com.rajeshkawali.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.entity.Employee;
import com.rajeshkawali.entity.ResponseWrapperClass;
import com.rajeshkawali.service.EmployeeService;

@RestController
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@Value("${message}")
    private String messageFromGit;
	
	@GetMapping("/{employeeId}")
	public Employee getEmployeeDetails(@PathVariable("employeeId") Long employeeId) {
		log.info("EmployeeController.getEmployeeDetails()");
		log.info(messageFromGit);
		Employee employee = employeeService.getEmployeeDetails(employeeId);
		return employee;
	}
	
	@PostMapping("/save")
	public void saveEmployeeDetails(@RequestBody Employee employee) {
		log.info("EmployeeController.saveEmployeeDetails()");
		employeeService.saveEmployeeDetails(employee);
	}
	
	@GetMapping("/details/{employeeId}")
	public ResponseWrapperClass getEmployeeDepartmentDetails(@PathVariable("employeeId") Long employeeId) {
		log.info("EmployeeController.getEmployeeDepartmentDetails()");
		log.info(messageFromGit);
		ResponseWrapperClass employeeDetails = employeeService.getEmployeeDepartmentDetails(employeeId);
		return employeeDetails;
	}
}
