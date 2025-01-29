package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;
import com.resource.DbResource;

public class EmployeeDao {

	public int storeEmployee(Employee emp) {
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?,?)");
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getName());
		pstmt.setFloat(3, emp.getSalary());
		pstmt.setString(4, emp.getDoj().toString());
		int result = pstmt.executeUpdate();
		return result;
				} catch (Exception e) {
					System.err.println(e.toString());
					return 0;
				}
	}
	
//	public ResultSet findAllEmployee() {
//		try {
//			Connection con = DbResource.getDbConnection();
//			PreparedStatement pstmt = con.prepareStatement("select * from employee");
//			ResultSet rs = pstmt.executeQuery();
//			return rs;
//			} catch (Exception e) {
//				System.err.println(e.toString());
//				return null;
//			}
//	}
	
	public List<Employee> findAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {		// convert each record to object of type employee 
				Employee e = new Employee();		
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDoj(LocalDate.parse(rs.getString(4)));
				
				listOfEmp.add(e);
			}
			return listOfEmp;
			} catch (Exception e) {
				System.err.println(e.toString());
				return null;
			}
	}
}
