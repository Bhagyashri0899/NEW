package com.cg.shoppingmall.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmall.entities.User;

public class IUserRepositoryImpl implements IUserRepository
{
	//Step 1: Start JPA LifeCycle
	
		private EntityManager entityManager;
		public IUserRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		// Create operation - Repo/DAO
		
		@Override
		public User addUser(User user) {
			entityManager.persist(user);
			return user;
		}

		@Override
		public User updateUser(User user) {
			entityManager.merge(user);
			return user;
		}

		@Override
		public User deleteUser(int id) {
			User user = entityManager.find(User.class, id);
			entityManager.remove(id);
			return user;
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
		public void login(User user) {
			
			entityManager.getTransaction().begin();
		}

		@Override
		public void logout() {
			
			entityManager.getTransaction().commit();
		}
}
