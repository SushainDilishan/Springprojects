package com.Krishantha.training.salesmanager;

import com.Krishantha.training.salesmanager.model.EmployeeRepository;
import com.Krishantha.training.salesmanager.model.HibernateEmployeeRepositoryImpl;
import com.Krishantha.training.salesmanager.service.EmployeeService;
import com.Krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.Krishantha")
@PropertySource("application.properties")
public class ApplicationConfiguration {
    @Bean(name ="employeeService")
    //@Scope("singleton")
    //@Scope("Prototype")
    public EmployeeService getEmployeeService(){

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

       // employeeService.setEmployeeRepository(geEmployeeRepository());
        return employeeService;
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
//    @Bean(name = "employeeRepository")
//    public EmployeeRepository geEmployeeRepository(){
//        return new HibernateEmployeeRepositoryImpl();
//    }
}
