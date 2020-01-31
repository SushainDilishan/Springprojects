package com.Krishantha.training.salesmanager.service;

import java.util.List;

import com.Krishantha.training.salesmanager.model.Employee;
import com.Krishantha.training.salesmanager.model.EmployeeRepository;
import com.Krishantha.training.salesmanager.model.HibernateEmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository){
		this.employeeRepository = employeeRepository;
	}
	public EmployeeRepository getEmployeeRepository(){
		return employeeRepository;
	}
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	@Override
	public List<Employee> getAllEmployees(){
		
		return employeeRepository.getAllEmployees();
	}
}
