package com.rajeshkawali.entity;

import org.springframework.stereotype.Component;

@Component
public class ResponseWrapperClass {

	private Employee employee;
	private Department department;

	public ResponseWrapperClass() {

	}

	public ResponseWrapperClass(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
