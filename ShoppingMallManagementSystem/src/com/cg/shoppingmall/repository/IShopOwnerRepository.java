package com.cg.shoppingmall.repository;

import com.cg.shoppingmall.entities.ShopOwner;

public interface IShopOwnerRepository 
{
    public ShopOwner addShopOwner(ShopOwner shopOwner);
    public ShopOwner updateShopOwner(ShopOwner shopOwner);
    
    public ShopOwner searchShopOwner(int id);     //long id;
    public ShopOwner deleteShopOwner(int id);    //long id;
    
}
