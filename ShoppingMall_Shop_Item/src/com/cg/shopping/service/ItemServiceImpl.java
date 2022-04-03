package com.cg.shopping.service;

import com.cg.shopping.entities.Item;
import com.cg.shopping.repository.IItemRepository;
import com.cg.shopping.repository.ItemRepositoryImpl;


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
