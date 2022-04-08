package com.cg.shoppingmall.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mallAdmin")
public class MallAdmin implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
   private int id;	
	
	@Column(name="name")
   private String name;
	
	@Column(name="password")
   private String password;
	
	@Column(name="mall")
   private String mall;
	
	@Column(name="phone")
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
