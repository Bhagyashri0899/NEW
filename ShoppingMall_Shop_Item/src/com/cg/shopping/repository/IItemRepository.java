package com.cg.shopping.repository;

import com.cg.shopping.entities.Item;

public interface IItemRepository 
{
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item searchItem(int id);
	public Item deleteItem(int id);
	
	 public abstract void beginTransaction();
	 public abstract void commitTrasaction();
	
}
