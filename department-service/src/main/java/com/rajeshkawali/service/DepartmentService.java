package com.rajeshkawali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeshkawali.dao.DepartmentDao;
import com.rajeshkawali.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	public Department getDepartmentDetails(Long departmentId) {
		return departmentDao.getDepartmentDetails(departmentId);
	}
	
	public void saveDepartmentDetails(Department department) {
		departmentDao.saveDepartmentDetails(department);
	}
}
