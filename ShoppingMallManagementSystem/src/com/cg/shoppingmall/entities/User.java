package com.cg.shoppingmall.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
    private int id;
	
	@Column(name="name")
private String name;
	
	@Column(name="type")	
private String type;
	
	@Column(name="password")
private String password;
	
	
	
	public User(int id, String name, String type, String password) {
		
		this.id =  id;
		this.name = name;
		this.type = type;
		this.password = password;
	}

	public User() {
		
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
