package org.ncu.spring_jdbc_app.dao;

import java.util.List;

import org.ncu.spring_jdbc_app.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertEmployee(Employee emp) {
		String query = "insert into employee values (?,?,?,?)";
		Object[] arr = {emp.getEmpId(), emp.getEmpName(), emp.getEmpSalary(), emp.getEmpAddress()};
		return jdbcTemplate.update(query, arr);
		/*
		 * if(result > 0) { System.out.println("Record inserted Successfully!"); return
		 * 1; }else { System.out.println("Error inserting record!!!"); return 0; }
		 */
	}

	@Override
	public Employee fetchEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployee(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> fetchEmployees() {
		String query = "select * from employee";
		
		return jdbcTemplate.query(query, new EmployeeDaoRowMapper());
	}

}
