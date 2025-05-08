package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.CabFare;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Integer>{

	@Query("select cf.fare from CabFare cf where cf.source = :source2 and cf.destination=:destination2")
	public float findFare(@Param("source2") String source, @Param("destination2") String destination);
	
	@Query("select cf.srno from CabFare cf where cf.source = :source1 and cf.destination=:destination1")
	public int findSourceAndDestination(@Param("source1") String source, @Param("destination1") String destination);
}
