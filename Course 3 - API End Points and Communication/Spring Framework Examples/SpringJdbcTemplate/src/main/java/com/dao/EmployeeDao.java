package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bean.Employee;


@Repository		// DAO layer annotation 
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;	
	public int storeEmployee(Employee employee) {
	try {
		return jdbcTemplate.update("insert into employee values(?,?,?)", employee.getId(),employee.getName(),employee.getSalary());
		} catch (Exception e) {
		System.err.println(e.toString());
		return 0;
		}
	}
	
	public int deleteEmployee(int id) {
		try {
			return jdbcTemplate.update("delete from employee where id =?", id);
		} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
		}
	}
	public int updateEmployee(Employee employee) {
		try {
return jdbcTemplate.update("update employee set salary=?,name=? where id=?", employee.getSalary(),employee.getName(),employee.getId());
		} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
		}
	}
	
	
}



