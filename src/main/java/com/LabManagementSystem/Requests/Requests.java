package com.LabManagementSystem.Requests;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Requests {
	
    private Long id;
	private String name;
    private String equipment;
	private String supplier;
	private String price;
	private String supplierID;

	protected Requests() {
	}

	protected Requests(Long id, String name, String equipment, String supplier, String price, String supplierID) {
		
        super();
		this.id = id;
		this.name = name;
		this.equipment = equipment;
		this.supplier = supplier;
		this.price = price;
        this.supplierID = supplierID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

    public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
}
