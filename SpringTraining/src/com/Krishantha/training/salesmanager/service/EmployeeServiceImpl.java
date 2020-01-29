package com.Krishantha.training.salesmanager.service;

import java.util.List;

import com.Krishantha.training.salesmanager.model.Employee;
import com.Krishantha.training.salesmanager.model.EmployeeRepository;
import com.Krishantha.training.salesmanager.model.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	@Override
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
