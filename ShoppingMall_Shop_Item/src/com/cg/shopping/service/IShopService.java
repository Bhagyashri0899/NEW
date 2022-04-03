package com.cg.shopping.service;


import com.cg.shopping.entities.Shop;

public interface IShopService 
{
    public Shop addShop(Shop shop);
    public Shop updateShop(Shop shop);
    public Shop searchShopById(int id);
       
    public boolean deleteShop(int id);
    
    
    
}
