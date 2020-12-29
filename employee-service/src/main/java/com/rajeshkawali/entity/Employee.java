package com.rajeshkawali.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private Long employeeId;
	private String fullName;
	private Long departmentId;

	public Employee() {

	}

	public Employee(Long employeeId, String fullName, Long departmentId) {
		super();
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.departmentId = departmentId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
}