package com.liveasy.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liveasy.app.entity.Transportation;
@Service
public interface TransportationService {


	void save(Transportation transport);

	Transportation getLoadwithId(Long id);

	void update(Transportation transport, Long id);

	void delete(Long id);

	List<Transportation> getLoadswithQueryId(Long id);
	

}
