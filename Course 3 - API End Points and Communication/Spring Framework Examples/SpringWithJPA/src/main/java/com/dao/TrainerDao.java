package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Trainer;

@Repository
public class TrainerDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int storeTrainer(Trainer trainer) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran  = manager.getTransaction();
			tran.begin();
						manager.persist(trainer);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Trainer> findAllTrainer() {
		EntityManager manager = emf.createEntityManager();
		Query qry  = manager.createQuery("select tt from Trainer tt");
		List<Trainer> listOfTrainer = qry.getResultList();
		return listOfTrainer;
	}
}
