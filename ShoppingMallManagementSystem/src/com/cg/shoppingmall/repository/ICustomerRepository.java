package com.cg.shoppingmall.repository;

import com.cg.shoppingmall.entities.Customer;
import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.Mall;
import com.cg.shoppingmall.entities.User;

public interface  ICustomerRepository
{
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer searchCustomerByname(String name);
	public Customer deleteCustomerByid(int id);
	public Customer searchCustomerByid(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	public void orderItem(Item item);
	public Mall searchMall(int id);
	public boolean cancelOrder( int orderId);
	public void login(User user);
	public void logout();
	
	
	
}
