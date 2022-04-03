package com.cg.shoppingmall.entities;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee extends Shop
{
	@Id
	
    private int id;
    private String name;
    private String dob;
    private float salary;
    private String address;
    private String designation;
    private Shop shop_id;
    
   
    

    
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Shop getShop_id() {
		return shop_id;
	}

	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
    
    
    
}
