package com.thymeleaf.demo.service;

import java.util.List;

import com.thymeleaf.demo.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
