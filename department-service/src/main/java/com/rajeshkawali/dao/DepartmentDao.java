package com.rajeshkawali.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.rajeshkawali.entity.Department;

@Repository
@Transactional
public class DepartmentDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Department getDepartmentDetails(Long departmentId) {
		System.out.println("DepartmentDao.getDepartmentDetails()");
		return entityManager.find(Department.class, departmentId);
	}

	public void saveDepartmentDetails(Department department) {
		System.out.println("DepartmentDao.saveDepartmentDetails()");
		entityManager.persist(department);
	}
}
