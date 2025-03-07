package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Trainer;
import com.dao.TrainerDao;

@Service
public class TrainerService {

	@Autowired
	TrainerDao trainerDao;

	public String storeTrainer(Trainer trainer) {
		if(trainerDao.storeTrainer(trainer)>0) {
			return "Trainer details stored";
		}else {
			return "Trainer didn't store";
		}
	}
	
	public List<Trainer> findAllTrainer() {
		return trainerDao.findAllTrainer();
	}
}
