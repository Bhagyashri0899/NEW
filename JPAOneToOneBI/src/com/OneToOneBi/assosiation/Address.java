package com.OneToOneBi.assosiation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Address implements Serializable{

	private static final long serialVerstionUID = 1L;
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ADDRESS_ID")
	private int addressId;
	@Column(name="ADDRESS_STREET")
	private String street;
	@Column(name="ADDRESS_city")
	private String city;
	@Column(name="ADDRESS_STATE")
	private String state;
	@Column(name="ADDRESS_ZIPCODE")
	private String zipcode;
	
	//to create bi-directional relationship, use one to one with mappedBy 
	//mappedBy attribute indicates property name of owner i.e. Student class
	@OneToOne(mappedBy = "address")
	private Student student;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	

}
