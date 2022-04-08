package com.cg.shoppingmall.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmall.entities.Customer;
import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.Mall;
import com.cg.shoppingmall.entities.User;

public class ICustomerRepositoryImpl implements ICustomerRepository
{
private EntityManager entitymanager;
	
	
	
	public ICustomerRepositoryImpl()
	{
		entitymanager= JPAUtil.getEntityManager();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		entitymanager.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		entitymanager.merge(customer);
		return customer;
	}

	@Override
	public Customer searchCustomerByid(int id) {
		Customer customer=entitymanager.find(Customer.class, id);
		return customer;
	}



	@Override
	public Customer searchCustomerByname(String name) {
		Customer customer=entitymanager.find(Customer.class, name);
		return customer;
	}

	@Override
	public Customer deleteCustomerByid(int id) {
		Customer customer=entitymanager.find(Customer.class, id);
		entitymanager.remove(customer);
		return customer;
	}

	@Override
	public void beginTransaction() {
       entitymanager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
       entitymanager.getTransaction().commit();
		
	}

	@Override
	public void orderItem(Item item) {
		entitymanager.persist(item);
		return;
	}

	@Override
	public Mall searchMall(int id) {
		Mall search = entitymanager.find(Mall.class, id);
		return search;
	}

	

	@Override
	public void login(User user) {
		entitymanager.getTransaction().begin();
		
	}

	@Override
	public void logout() {
		entitymanager.getTransaction().commit();
		
	}

	@Override
	public boolean cancelOrder(int orderId) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
