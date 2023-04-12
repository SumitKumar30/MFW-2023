package org.ncu.spring_jdbc_app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.spring_jdbc_app.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoRowMapper implements RowMapper<Employee> {
	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt(1));
		emp.setEmpName(rs.getString(2));
		emp.setEmpSalary(rs.getDouble(3));
		emp.setEmpAddress(rs.getString(4));
		return emp;
	}

}
