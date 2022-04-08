package com.cg.shoppingmall.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item 
{
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
    private String name;
    
    @Column(name="manufacturing")
    private String manufacturing;
    
    @Column(name="expiry")
    private String expiry;
    
    @Column(name="category")
    private String category;
    
    @Column(name="price")
    private float price;
    
	public int getId() {
		return id;
	}
	public String getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(String manufacturing) {
		this.manufacturing = manufacturing;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
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
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
    
    
}
