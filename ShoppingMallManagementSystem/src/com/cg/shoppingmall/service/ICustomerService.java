package com.cg.shoppingmall.service;

import java.util.List;

import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.Mall;
import com.cg.shoppingmall.entities.User;


public interface ICustomerService {
	public Item orderItem(Item item);
	public List<Item> searchItem(String itemName);
	public Mall searchMall(int id);
	public boolean cancelOrder(int orderId);
	public User login(User user);
	public boolean logout();
}
