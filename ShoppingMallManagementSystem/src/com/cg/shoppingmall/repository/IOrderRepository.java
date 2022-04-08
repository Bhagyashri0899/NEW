package com.cg.shoppingmall.repository;

import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.OrderDetails;

public interface IOrderRepository {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(int id);
	public OrderDetails deleteOrder(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	public void addItem(Item item);
}
