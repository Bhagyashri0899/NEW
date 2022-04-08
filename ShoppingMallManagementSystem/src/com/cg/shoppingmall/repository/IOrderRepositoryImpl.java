package com.cg.shoppingmall.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmall.entities.OrderDetails;

public class IOrderRepositoryImpl implements IOrderRepository
{
	private EntityManager entityManager;
	public IOrderRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		entityManager.persist(order);
		return order;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		entityManager.merge(order);
		return order;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails details = entityManager.find(OrderDetails.class, id);
		return details;
	}

	@Override
	public OrderDetails deleteOrder(int id) {
		entityManager.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
