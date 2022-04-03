package com.cg.shopping.repository;

import javax.persistence.EntityManager;

import com.cg.shopping.entities.ShopOwner;

public class ShopOwnerImpl implements IShopOwnerRepository
{

	//Step 1: Start JPA LifeCycle
	
    //create entity manager object, and import
		private EntityManager entityManager;
		public ShopOwnerImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		
	//Create operation in repository/DAO
		
	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		return shopOwner;	
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		entityManager.merge(shopOwner);
		return shopOwner ;
	}

	@Override
	public ShopOwner searchShopOwner(int id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class,id);
		return shopOwner;
	}

	@Override
	public ShopOwner deleteShopOwner(int id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class,id);
		entityManager.remove(shopOwner);
		return shopOwner;
	}

}
