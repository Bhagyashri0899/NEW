package com.cg.placement.service;


import com.cg.placement.entities.Shop;

public interface IShopService 
{
    public Shop addShop(Shop shop);
    public Shop updateShop(Shop shop);
    public Shop searchShopById(int id);
       
    public boolean deleteShop(int id);
    
    
    
}
