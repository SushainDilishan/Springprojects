package com.Krishantha.training.salesmanager.application;
import java.util.List;


import com.Krishantha.training.salesmanager.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Krishantha.training.salesmanager.model.Employee;
import com.Krishantha.training.salesmanager.service.EmployeeService;


public class Application {
		
		
		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new
					AnnotationConfigApplicationContext(ApplicationConfiguration.class);

			EmployeeService employeeService =
					
					applicationContext.getBean("employeeService", EmployeeService.class);
			List<Employee> employees = employeeService.getAllEmployees();
			
			for(Employee employee : employees ) {
				
				System.out.println(employee.getEmployeeName() + " at "
						+ employee.getEmloyeeLocation());
				
			}
			
		}
}
