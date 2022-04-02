package com.cg.placement.repository;


import com.cg.placement.entities.Shop;

public interface  IShopRepository
{
   public Shop addShop(Shop shop);
   public Shop updateShop(Shop shop);
   public Shop searchShopById(int id);
   public boolean deleteShop(int id);
   
    public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	
	
	
	
}
