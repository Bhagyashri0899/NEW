package com.cg.shoppingmall.entities;




import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee
{

	// private static final long serialVersionUID = 1L;
		 @Id
		// @GeneratedValue(strategy=GenerationType.AUTO)
		 @Column(name="id")
	private int id;
		 
		 @Column(name="name")
	private String name;
		 
		 @Column(name="dob")
	private String dob;
		 
		 @Column(name="salary")
	private float salary;
		 
		 @Column(name="address")
	private String address;
		 
		 @Column(name="designation")
	private String designation;
		 
		 //@ManyToOne
		 //@JoinColumn(name="shop_id")
		 //private Shop shop_d;
//		@Column(name="shop_id")	
	//  private Shop shop_id;

		
		public Employee() 
		{
			
		}


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


		public String getDob() {
			return dob;
		}


		public void setDob(String dob) {
			this.dob = dob;
		}


		public float getSalary() {
			return salary;
		}


		public void setSalary(float salary) {
			this.salary = salary;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}


//		public Shop getShop_id() {
//			return shop_id;
//		}
	//
	//
//		public void setShop_id(int shop_id) {
//			this.shop_id = shop_id;
//		}
		

    
    
    
}
