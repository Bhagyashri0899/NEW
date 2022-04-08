package com.cg.shoppingmall.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmall.entities.MallAdmin;

public class IMallAdminRepositoryImpl implements IMallAdminRepository
{
	private EntityManager entityManager;
	public IMallAdminRepositoryImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		entityManager.persist(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		MallAdmin update = entityManager.merge(mallAdmin);
		return update;
	}

	@Override
	public MallAdmin deleteMallAdmin(int id) {
		entityManager.remove(id);
		return null;
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		entityManager.find(MallAdmin.class, id);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void updateUser(MallAdmin mallAdmin) {
		entityManager.merge(mallAdmin);
		return;
		
	}

	@Override
	public void login(MallAdmin mallAdmin) {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void logout() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void approveNewShop(MallAdmin mallAdmin) {
		
	}

}
