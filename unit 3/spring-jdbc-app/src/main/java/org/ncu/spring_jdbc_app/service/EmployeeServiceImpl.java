package org.ncu.spring_jdbc_app.service;

import java.util.List;

import org.ncu.spring_jdbc_app.dao.EmployeeDao;
import org.ncu.spring_jdbc_app.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public int createRecord(Employee emp) {
		if(empDao.insertEmployee(emp) == 1) {
			System.out.println("Record inserted Successfully!!");
			return 1;
		}
			
		else {
			System.out.println("Error saving record!!!");
			return 0;
		}
			
	}

	@Override
	public Employee readRecord(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateRecord(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRecord(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> fetchRecords() {
		 List<Employee> emps = empDao.fetchEmployees();
		 if(emps != null)
			 return emps;
		 else
			 return null;
	}

}
