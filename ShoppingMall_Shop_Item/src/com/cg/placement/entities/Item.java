package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item 
{
	@Id
	private int id;
    private String name;
    private int manufacturing;
    private int expiry;
    private String category;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(int manufacturing) {
		this.manufacturing = manufacturing;
	}
	public int getExpiry() {
		return expiry;
	}
	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
    
    
    
}
