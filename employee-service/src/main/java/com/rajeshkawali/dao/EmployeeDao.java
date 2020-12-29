package com.rajeshkawali.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.rajeshkawali.entity.Employee;

@Repository
@Transactional
public class EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Employee getEmployeeDetails(Long employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}
	
	public void saveEmployeeDetails(Employee employee) {
		entityManager.persist(employee);
	}

}
