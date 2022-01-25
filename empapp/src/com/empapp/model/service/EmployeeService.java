package com.empapp.model.service;

import java.util.List;

import com.empapp.model.persistence.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public void deleteEmployee(int id);
	public void updateEmployee(int id,Employee employee);
	public List<Employee> getAll();
	public Employee getById(int id);
}
