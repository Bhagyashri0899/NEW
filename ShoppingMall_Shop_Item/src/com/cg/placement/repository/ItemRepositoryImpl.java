package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Item;

public class ItemRepositoryImpl implements IItemRepository
{

	    //Step 1: Start JPA LifeCycle
	
			private EntityManager entityManager;
			public ItemRepositoryImpl() 
			{
				entityManager = JPAUtil.getEntityManager();
			}
			
			
	@Override
	public Item addItem(Item item) {	
			entityManager.persist(item);
			return item;
		}


	@Override
	public Item updateItem(Item item) {
		entityManager.merge(item);
		return item;
	}


	@Override
	public Item searchItem(int id) {
		Item item =entityManager.find(Item.class,id);
		return item;
	}


	@Override
	public Item deleteItem(int id) {
		Item item =entityManager.find(Item.class,id);
		entityManager.remove(item);
		return item;
	}


	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}


	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
		
	}
	}


