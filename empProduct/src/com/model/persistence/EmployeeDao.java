package com.model.persistence;

import java.util.List;
import java.util.Optional;

import com.model.exception.DataAccessException;

public interface EmployeeDao {
	public Employee addEmployee(Employee employee);
	public Employee deleteEmployee(int id);
	public Employee updateEmployee(int id , Employee employee);
	public List<Employee> getAll()throws DataAccessException;
	public Optional<Employee> getById(int id);
}
