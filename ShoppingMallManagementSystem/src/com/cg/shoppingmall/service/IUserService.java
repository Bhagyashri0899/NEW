package com.cg.shoppingmall.service;


import com.cg.shoppingmall.entities.User;

public interface IUserService {
	public User addNewUser(User user);
	public User updateUser(User user);
	
	public User login(User user);
	public boolean logOut();
	
}
