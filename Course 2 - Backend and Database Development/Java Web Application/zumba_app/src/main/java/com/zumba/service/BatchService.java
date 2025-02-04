package com.zumba.service;

import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.dao.BatchDao;

public class BatchService {

	BatchDao bd = new BatchDao();
	
	
	public List<Batch> viewAllBatchDetails() {
		return bd.viewAllBatch();	// after retrieve if need any business logic we can apply and return 
	}
}
