package com.LabManagementSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EquipmentService {

	@Autowired
	private EquipmentRepository repo;
	
	public List<Equipment> listAll() {
		return repo.findAll();
	}
	
	public void save(Equipment equipment) {
		repo.save(equipment);
	}
	
	public Equipment get(long id) {
		return repo.findById(id).get();
	}
}
