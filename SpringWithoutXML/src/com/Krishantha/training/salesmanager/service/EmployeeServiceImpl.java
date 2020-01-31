package com.Krishantha.training.salesmanager.service;

import java.util.List;

import com.Krishantha.training.salesmanager.model.Employee;
import com.Krishantha.training.salesmanager.model.EmployeeRepository;
import com.Krishantha.training.salesmanager.model.HibernateEmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	public EmployeeServiceImpl(){
		System.out.println("Default Constructor Executed");
	}
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Overload Constructor Executed");
		this.employeeRepository = employeeRepository;
	}


	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
