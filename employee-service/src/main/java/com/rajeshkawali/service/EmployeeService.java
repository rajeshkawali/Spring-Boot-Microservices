package com.rajeshkawali.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rajeshkawali.dao.EmployeeDao;
import com.rajeshkawali.entity.Department;
import com.rajeshkawali.entity.Employee;
import com.rajeshkawali.entity.ResponseWrapperClass;
import com.rajeshkawali.util.EmployeeProxy;

@Service
@RefreshScope
public class EmployeeService {

	private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeProxy employeeProxy;

	@Autowired
	private ResponseWrapperClass wrapper;

	@HystrixCommand(fallbackMethod = "hystrixFallBackMethod")
	public ResponseWrapperClass getEmployeeDepartmentDetails(Long employeeId) {
		log.info("EmployeeService.getEmployeeDepartmentDetails()");
		Employee employee = employeeDao.getEmployeeDetails(employeeId);
		Department department = employeeProxy.getDepartmentDetails(employee.getDepartmentId());
		wrapper.setEmployee(employee);
		wrapper.setDepartment(department);
		return wrapper;
	}
	
	public ResponseWrapperClass hystrixFallBackMethod(Long employeeId) {
		log.info("EmployeeService.hystrixFallBackMethod()");
		Employee employee = new Employee(0L,"Empty",0L);
		Department department = new Department(0L,"Not Available","Not Available");
		wrapper.setEmployee(employee);
		wrapper.setDepartment(department);
		return wrapper;
	}

	public void saveEmployeeDetails(Employee employee) {
		log.info("EmployeeService.saveEmployeeDetails()");
		employeeDao.saveEmployeeDetails(employee);
	}

	public Employee getEmployeeDetails(Long employeeId) {
		log.info("EmployeeService.getEmployeeDetails()");
		Employee employee = employeeDao.getEmployeeDetails(employeeId);
		return employee;
	}

}
