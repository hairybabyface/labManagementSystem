package com.LabManagementSystem.Requests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RequestsService {

	@Autowired
	private RequestsRepository repo;
	
	public List<Requests> listAll() {
		return repo.findAll();
	}
	
	public void save(Requests requests) {
		repo.save(requests);
	}
	
	public Requests get(long id) {
		return repo.findById(id).get();
	}
}
