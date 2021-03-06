package com.Krishantha.training.salesmanager.application;
import java.util.List;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Krishantha.training.salesmanager.model.Employee;
import com.Krishantha.training.salesmanager.service.EmployeeService;


public class Application {
		
		
		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new 
					ClassPathXmlApplicationContext("applicationContext.xml");
			EmployeeService employeeService =
					
					applicationContext.getBean("employeeservice", EmployeeService.class);
			List<Employee> employees = employeeService.getAllEmployees();
			
			for(Employee employee : employees ) {
				
				System.out.println(employee.getEmployeeName()+ "at"
						+ employee.getEmloyeeLocation());
				
			}
			
		}
}
