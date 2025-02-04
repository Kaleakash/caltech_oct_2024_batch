package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.resource.DatabaseResource;

public class BatchDao {

	public List<Batch> viewAllBatch() {
		List<Batch> listOfBatch = new ArrayList<Batch>();
		try {
		Connection con = DatabaseResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from batch");	// as string format 
		ResultSet rs = pstmt.executeQuery();		// in while loop we need to convert to object ie batch object 
		while(rs.next()) {
			// it display on console. 
//System.out.println("batch id "+rs.getInt(1)+" Type of batch "+rs.getString(2)+" time "+rs.getString(3));
			Batch bb = new Batch();
			bb.setBid(rs.getInt("bid"));
			bb.setTypeofbatch(rs.getString("typeofbatch"));
			bb.setTime(rs.getString("time"));
			// converted as batch object 
			listOfBatch.add(bb);		// store in list 
		}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return listOfBatch;
	}
}
