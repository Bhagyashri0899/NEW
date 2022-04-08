package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.OrderDetails;
import com.cg.shoppingmall.repository.IOrderRepository;
import com.cg.shoppingmall.repository.IOrderRepositoryImpl;

public class IOrderServiceImpl implements IOrderService{
	
	private IOrderRepository dao;

	public IOrderServiceImpl() {
		dao=new IOrderRepositoryImpl();
	}

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.addOrder(order);
	    dao.commitTransaction();

		return order;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.updateOrder(order);
		dao.commitTransaction();

		return order;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails order= dao.searchOrder(id);
		return order;
	}

	@Override
	public boolean cancelMall(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Item addItem(Item item) {
		dao.beginTransaction();
		dao.addItem(item);
		dao.commitTransaction();
		return item;
	}
		

}
