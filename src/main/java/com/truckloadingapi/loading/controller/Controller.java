package com.truckloadingapi.loading.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.truckloadingapi.loading.entities.loaders;
import com.truckloadingapi.loading.services.loaderservice;


@RestController
public class Controller {
	
    @Autowired
	private loaderservice ls;
	
	//get the loaders
	
	@GetMapping("/loaders")
	public List<loaders> getnames(){
	
		//creating another package for services to get all the services for getting names
	return this.ls.getnames();
	}
	
	//getting loader for particular truck id
	@GetMapping("/loaders/{truckid}")
	public loaders getname(@PathVariable String truckid)
	{
		return this.ls.getname(Long.parseLong(truckid));
	}
	
	//adding names
	@PostMapping("/loaders")
	public loaders addname(@RequestBody loaders load) {
		return this.ls.addname(load);
	}
	
	//update name using post request
	@PutMapping("/loaders")
	public loaders updatename(@RequestBody loaders load) {
		return this.ls.updatename(load);
	}
	
	//delete name
	@DeleteMapping("/loaders/{truckid}")
	public ResponseEntity<HttpStatus> deletename(@PathVariable String truckid){
		try {
			this.ls.deletename(Long.parseLong(truckid));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
