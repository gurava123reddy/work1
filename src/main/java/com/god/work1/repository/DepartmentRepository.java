package com.god.work1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.god.work1.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
 
	public List<Department> findAll();
}
