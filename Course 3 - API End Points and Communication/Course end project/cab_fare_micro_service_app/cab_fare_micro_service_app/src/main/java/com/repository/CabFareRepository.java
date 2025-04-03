package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.CabFare;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Integer>{

	@Query("select cf.fare from CabFare cf where cf.source = :source and cf.destination=:destination")
	public float findFare(@Param("source") String source, @Param("destination") String destination);
	
	@Query("select cf.srno from CabFare cf where cf.source = :source and cf.destination=:destination")
	public int findSourceAndDestination(@Param("source") String source, @Param("destination") String destination);
}
