package com.service.collegeP.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.collegeP.Entity.College;
import com.service.collegeP.Repository.Repository;

@Service
public class serviceImpl implements services {
	@Autowired
	private Repository repo;

	@Override
	public List<College> getColleges() {
		
		return repo.findAll();
	}

}
