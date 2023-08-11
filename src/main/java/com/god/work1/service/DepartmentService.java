package com.god.work1.service;

import java.util.List;

import com.god.work1.entity.Department;

public interface DepartmentService {
	
	public Department saveDepartment(Department department);
	public void getDepartment(Long departmentId);
	public List<Department> fetchDepartmentList();
	public Department updateDepartment(Department department, Long departmentId);
	public void deleteDepartmentById(Long departmentId);

}
