package com.cg.shoppingmall.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmall.entities.Mall;

public class IMallRepositoryImpl implements IMallRepository
{

	private EntityManager entityManager;
	public IMallRepositoryImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}
	
	
	@Override
	public Mall addMall(Mall mall) {
		entityManager.persist(mall);
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		 entityManager.merge(mall);
		return mall;
	}

	@Override
	public Mall searchMall(int id) {
		Mall search = entityManager.find(Mall.class, id);
		return search;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
