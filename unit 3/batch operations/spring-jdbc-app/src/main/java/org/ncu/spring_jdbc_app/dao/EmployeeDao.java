package org.ncu.spring_jdbc_app.dao;

import java.util.List;

import org.ncu.spring_jdbc_app.entity.Employee;

public interface EmployeeDao {
	public int insertEmployee(Employee emp);
	public Employee fetchEmployee(int empId);
	public int updateEmployee(int empId);
	public int deleteEmployee(int empId);
	public List<Employee> fetchEmployees();
	
	public int[] batchEmployeeInsert(List<Employee> emps);
}
