package com.liveasy.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.liveasy.app.entity.Transportation;


@Repository
public interface TransportationRepository extends JpaRepository<Transportation,Long>{

	@Query(" select o from Transportation o where o.shipperId =?1")
	public List<Transportation> findShippers (Long id);
	

}
