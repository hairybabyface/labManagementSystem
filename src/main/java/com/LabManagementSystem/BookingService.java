package com.LabManagementSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookingService {

	@Autowired
	private BookingRepository repo;
	
	public List<Booking> listAll() {
		return repo.findAll();
	}
	
	public void save(Booking booking) {
		repo.save(booking);
	}
	
	public Booking get(long id) {
		return repo.findById(id).get();
	}
}
