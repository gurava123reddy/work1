package com.god.work1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.god.work1.entity.Department;
import com.god.work1.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	
	private DepartmentRepository departmentRepository;
	
	@Autowired
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
		
	}

	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		return null;
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDepartment(Long departmentId) {
		 departmentRepository.findById(departmentId);
	}

	
}
