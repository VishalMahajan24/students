package com.service.studentsP.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.studentsP.Entity.Student;
import com.service.studentsP.Repository.Repository;

@Service
public class serviceImpl implements services {

	@Autowired
	private Repository repo;
	
	@Override
	public List<Student> getCOEP() {
		
		return repo.getCOEP();
	}

	@Override
	public List<Student> getTKIET() {
		
		return repo.getTKIET();
	}

	@Override
	public List<Student> getPICT() {
	
		return repo.getPICT();
	}

	@Override
	public List<Student> getIIT() {
		
		return repo.getIIT();
	}

	@Override
	public List<Student> getAllst() {
	
		return repo.getAllst();
	}

	

	

}
