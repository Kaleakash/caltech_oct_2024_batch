package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	public List<Map<String,Object>> retrieveEmployeeAsMap() {
		try {
	// converted each record as map object. 
return jdbcTemplate.queryForList("select * from employee");
		} catch (Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}
	public List<Employee> getAllEmployeeAsListOfEmployee() {
		try {
return jdbcTemplate.query("select * from employee", new MyRowMapper());
		} catch (Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}
	
}
// map each record to objects. 
class MyRowMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		return emp;
	}
}


