package com.liveasy.app.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.app.entity.Transportation;
import com.liveasy.app.repository.TransportationRepository;
import com.liveasy.app.service.TransportationService;
@Service 
public class TransportationServiceImpl implements TransportationService{

	@Autowired
	TransportationRepository repo;
	
	
	@Override
	public void save(Transportation transport) {
		// TODO Auto-generated method stub
		repo.save(transport);
		
	}

	@Override
	public Transportation getLoadwithId(Long id) {
		
		
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void update(Transportation transport, Long id) {
		// TODO Auto-generated method stub
		repo.save(transport);
		
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transportation> getLoadswithQueryId(Long id) {
		// TODO Auto-generated method stub
		
		return repo.findShippers(id);
	}
	
	

}
