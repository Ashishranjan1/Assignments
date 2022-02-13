package com.model.service;

import java.util.List;
import java.util.Optional;

import com.model.exception.DataAccessException;
import com.model.persistence.Employee;
import com.model.persistence.EmployeeDao;
import com.model.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao=new EmployeeDaoImpl();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public Employee deleteEmployee(int id) {
		
		return employeeDao.deleteEmployee(id);
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		
		return employeeDao.updateEmployee(id, employee);
	}

	@Override
	public List<Employee> getAll() throws DataAccessException {
		return employeeDao.getAll();
	}

	@Override
	public Optional<Employee> getById(int id) {
		return employeeDao.getById(id);
	}

}
