package com.cg.shopping.service;

import com.cg.shopping.entities.Shop;
import com.cg.shopping.repository.IShopRepository;
import com.cg.shopping.repository.ShopRepositoryImpl;



public class ShopServiceImpl implements IShopService
{

	// Step 1: Establishing connection between Service and Repo
	
			private IShopRepository dao;
			
			public ShopServiceImpl() 
			{
				dao = new ShopRepositoryImpl();
			}
			
	// Step 2: Service calls to perform CRUD Operation

	@Override
	public Shop addShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop)
	{
		dao.beginTransaction();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;		
	}

	@Override
	public Shop searchShopById(int id)
	{
		Shop shop = dao.searchShopById(id);
		return shop;
	}


	@Override
	public boolean deleteShop(int id) {
		dao.beginTransaction();
		dao.deleteShop(id);
		dao.commitTransaction();
		
		return false;
	}


}
