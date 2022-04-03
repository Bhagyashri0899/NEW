package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.repository.IItemRepository;
import com.cg.shoppingmall.repository.ItemRepositoryImpl;

public class ItemServiceImpl implements IItemService
{

	
	// Step 1: Establishing connection between Service and Repo
	
				private IItemRepository dao;
				
				public ItemServiceImpl() 
				{
					dao = new ItemRepositoryImpl();
				}
				
				
				//changes
				@Override
				public Item addItem(Item item) {
					
					dao.beginTransaction();
					dao.addItem(item);
					dao.commitTrasaction();
					return item;
				}

}
