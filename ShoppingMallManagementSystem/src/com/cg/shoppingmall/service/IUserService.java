package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.Employee;
import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.OrderDetails;
import com.cg.shoppingmall.entities.Shop;
import com.cg.shoppingmall.entities.User;

public interface IUserService {
	public User addUser1(OrderDetails order);
	public User updateUser(User user);
	
	public User login(User user);
	public boolean logOut();
	public void addItem(Item item);
	public void addUser(OrderDetails order);
	
	public void addOrder(User user);
	//public void addOrder1(OrderDetails order);
	public User addUser(User user);
	public void addEmployee(Employee empl);
	public void addShop(Shop shop);
}
