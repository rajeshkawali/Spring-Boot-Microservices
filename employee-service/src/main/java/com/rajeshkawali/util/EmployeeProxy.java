package com.rajeshkawali.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rajeshkawali.entity.Department;

@FeignClient(name = "department-service")
public interface EmployeeProxy {

	@GetMapping("/{departmentId}")
	public Department getDepartmentDetails(@PathVariable("departmentId") Long departmentId);
}
