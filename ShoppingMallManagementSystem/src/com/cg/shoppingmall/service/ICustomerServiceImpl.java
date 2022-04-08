package com.cg.shoppingmall.service;

import java.util.List;

import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.Mall;
import com.cg.shoppingmall.entities.User;
import com.cg.shoppingmall.repository.ICustomerRepository;
import com.cg.shoppingmall.repository.ICustomerRepositoryImpl;

public class ICustomerServiceImpl implements ICustomerService
{
private ICustomerRepository dao;
	
	public ICustomerServiceImpl() 
	{
		dao=new ICustomerRepositoryImpl();
	}

	@Override
	public Item orderItem(Item item) {
		dao.beginTransaction();
		dao.orderItem(item);
		dao.commitTransaction();
		return item;
	}

	@Override
	public List<Item> searchItem(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall = dao.searchMall(id);
		return mall;
	}

	@Override
	public boolean cancelOrder(int orderId) {
		 dao.beginTransaction();
		    dao.cancelOrder(orderId);
			dao.commitTransaction();
			return false;
	
	}

	@Override
	public User login(User user) {
		dao.beginTransaction();
		dao.login(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public boolean logout() {
		 dao.beginTransaction();
		    dao.logout();
			dao.commitTransaction();
			return false;
	}
	
	
	
}
