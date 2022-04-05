package com.cg.shopping.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mallAdmin")
public class MallAdmin implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
   private int id;	
   private String name;	
   private String password;
   private String mall;
   private String phone;
   
   
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMall() {
	return mall;
}
public void setMall(String mall) {
	this.mall = mall;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

	
	
	
}
