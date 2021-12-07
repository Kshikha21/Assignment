package com.liveasy.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.app.entity.Transportation;
import com.liveasy.app.service.TransportationService;

@RestController
public class Controller {
	
	@Autowired
	TransportationService transportService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to transportation page";
	}
	
	
	//add loads
	@PostMapping("/load")
	private String  addLoads(@RequestBody Transportation transport) {
		transportService.save(transport);
		return "loads details Successfully added";
	}
	
	//get load
		@GetMapping("/loadwith/{id}")
		private List<Transportation> getLoads(@PathVariable("id") Long id){
			List<Transportation> listofshipper =new ArrayList<Transportation>();
			listofshipper=transportService.getLoadswithQueryId(id);
	        System.out.println(listofshipper);
			return listofshipper;
			
			
		}
// get load with a specified load id 
		@GetMapping("/load/{id}")
		private Transportation getLoadwithId(@PathVariable("id") Long id) {
			return transportService.getLoadwithId(id);
			
		}
		
		@PutMapping("/load/{id}")
		private Transportation update(@RequestBody Transportation transport, @PathVariable("id") Long id) {
			transportService.update(transport,id);
			return transport;	
		}
		
		@DeleteMapping("/load/{id}")
		private String deleteShipper(@PathVariable("id") Long id) {
			transportService.delete(id);
			return "Delete successfully";
			
			
		}
		
  
	

}
