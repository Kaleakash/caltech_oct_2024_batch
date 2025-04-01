package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.BookingInfo;

@Repository
public interface BookingInfoRepository extends JpaRepository<BookingInfo, Integer>{

}
