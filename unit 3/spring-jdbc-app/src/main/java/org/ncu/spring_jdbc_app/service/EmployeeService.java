package org.ncu.spring_jdbc_app.service;

import java.util.List;

import org.ncu.spring_jdbc_app.entity.Employee;

public interface EmployeeService {
	
	public int createRecord(Employee emp);
	public Employee readRecord(int empId);
	public int updateRecord(int empId);
	public int deleteRecord(int empId);
	public List<Employee> fetchRecords();
}
