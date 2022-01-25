package com.empapp.model.service;

import java.util.List;

import com.empapp.model.persistence.Employee;
import com.empapp.model.persistence.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService 
{
	private EmployeeDao employeeDao;
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		employeeDao.addEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
	employeeDao.deleteEmployee(id);	
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
