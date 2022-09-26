package com.service.collegeP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.collegeP.Entity.College;
import com.service.collegeP.services.services;

@RestController
@RequestMapping("/college")
public class Controller {
	@Autowired
	private services ser;
	
	@GetMapping("/")
	public List <College> getColleges(){
		return this.ser.getColleges();
	}

}
