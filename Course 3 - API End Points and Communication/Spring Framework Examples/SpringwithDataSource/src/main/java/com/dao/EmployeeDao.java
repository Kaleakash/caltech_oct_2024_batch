package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Employee;


@Repository		// DAO layer annotation 
public class EmployeeDao {

	@Autowired
	DataSource ds;	// it search database connection in beans.xml file 
	// if present it do DI for that data source. by default it consider as byType.
	
	public int storeEmployee(Employee employee) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setFloat(3, employee.getSalary());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
		}
	}
}



