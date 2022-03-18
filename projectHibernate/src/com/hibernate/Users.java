package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class Users {
	public Users() {
		
}

public Users(int users_id, String users_fname, String users_lname, String users_email) {
	this.users_id = users_id;
	this.users_fname = users_fname;
	this.users_lname = users_lname;
	this.users_email = users_email;
}

@Id 
@Column(name="users_id")
int users_id;

@Column(name="users_fname")
String users_fname;

@Column(name="users_lname")
String users_lname;

@Column(name="users_email")
String users_email;

public int getUsers_id() {
	return users_id;
}

public void setUsers_id(int users_id) {
	this.users_id = users_id;
}

public String getUsers_fname() {
	return users_fname;
}

public void setUsers_fname(String users_fname) {
	this.users_fname = users_fname;
}

public String getUsers_lname() {
	return users_lname;
}

public void setUsers_lname(String users_lname) {
	this.users_lname = users_lname;
}

public String getUsers_email() {
	return users_email;
}

public void setUsers_email(String users_email) {
	this.users_email = users_email;
}

@Override
public String toString() {
	return "Users [users_id=" + users_id + ", users_fname=" + users_fname + ", users_lname=" + users_lname
			+ ", users_email=" + users_email + "]";
}
}