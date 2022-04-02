package com.cg.placement.repository;

import com.cg.placement.entities.Shop;

public interface  IShopRepository
{
   public Shop addShop(Shop shop);
   public Shop updateShop(Shop shop);
   public Shop searchShopById(int id);
   public Shop deleteShop(Shop shop);
   
    public abstract void beginTransaction();
	public abstract void commitTrasaction();
	
	public Shop addEmployee(Shop shop);
	public Shop updateEmployee(Shop shop);
	public Shop addItem(Shop shop);
	void deleteShop(int id);
	
	
}
