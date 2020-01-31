package com.Krishantha.training.salesmanager.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	@Value("${name}")
	private String employeeName;
	@Value("${city}")
	private String employeeCity;
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees =new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		employee.setEmloyeeLocation(employeeCity);
		employees.add(employee);
		return employees;
		
	}
}
