package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Shop;

public class ShopRepositoryImpl implements IShopRepository
{
	//Step 1: Start JPA LifeCycle
	
		private EntityManager entityManager;
		public ShopRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		
	// Create operation - Repo/DAO
	@Override
	public Shop addShop(Shop shop) 
	{
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) 
	{
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop searchShopById(int id) 
	{
		Shop shop = entityManager.find(Shop.class,id);
		return shop;
	}

	@Override
	public void deleteShop(int id)
	{
		Shop shop = entityManager.find(Shop.class,id);
		entityManager.remove(shop);
	}

	@Override
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTrasaction()
	{
		entityManager.getTransaction().commit();
		
	}

	@Override
	public Shop addEmployee(Shop shop)
	{
		entityManager.persist(shop);
		return shop;		
	}

	@Override
	public Shop updateEmployee(Shop shop)
	{
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop addItem(Shop shop)
	{	
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop deleteShop(Shop shop) {
		entityManager.remove(shop);
		return shop;
	}

}
