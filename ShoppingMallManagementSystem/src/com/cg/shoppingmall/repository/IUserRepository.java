package com.cg.shoppingmall.repository;

import com.cg.shoppingmall.entities.User;

public interface IUserRepository {
	public User addNewUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
	public void login(User user);
	public void logout();
}
