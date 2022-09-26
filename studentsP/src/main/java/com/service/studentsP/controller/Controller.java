package com.service.studentsP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.studentsP.Entity.Student;
import com.service.studentsP.services.services;

@RestController
@RequestMapping("/student")
public class Controller {
	@Autowired
	private services ser;
	
	@GetMapping("/TKIET")
	public List <Student> getTKIET(){
		return this.ser.getTKIET();
	}
	
	@GetMapping("/PICT")
	public List <Student> getPICT(){
		return this.ser.getPICT();
	}
	
	@GetMapping("/IIT")
	public List <Student> getIIT(){
		return this.ser.getIIT();
	}
	
	
	@GetMapping("/COEP")
	public List <Student> getCOEP(){
		return this.ser.getCOEP();
	}
	
	@GetMapping("/All")
	public List <Student> getAllst(){
		return this.ser.getAllst();
	}
	
	

}
