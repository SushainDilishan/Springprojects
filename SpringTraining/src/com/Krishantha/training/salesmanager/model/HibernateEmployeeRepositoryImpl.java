package com.Krishantha.training.salesmanager.model;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees =new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Sushain");
		employee.setEmloyeeLocation("Piliyandala");
		employees.add(employee);
		return employees;
		
	}
}
