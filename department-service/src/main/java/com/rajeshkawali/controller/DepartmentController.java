package com.rajeshkawali.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.entity.Department;
import com.rajeshkawali.service.DepartmentService;

@RestController
public class DepartmentController {

	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/{departmentId}")
	public Department getDepartmentDetails(@PathVariable("departmentId") Long departmentId) {
		log.info("DepartmentController.getDepartmentDetails()");
		Department department = departmentService.getDepartmentDetails(departmentId);
		return department;
	}

	@PostMapping("/save")
	public void saveDepartmentDetails(@RequestBody Department department) {
		log.info("DepartmentController.saveDepartmentDetails()");
		departmentService.saveDepartmentDetails(department);
	}
}
