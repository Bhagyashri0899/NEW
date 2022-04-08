package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.User;
import com.cg.shoppingmall.repository.IUserRepository;
import com.cg.shoppingmall.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService {
	// Step 1: Establishing connection between Service and Repo
		private IUserRepository dao;
		public IUserServiceImpl() 
		{
			dao = new IUserRepositoryImpl();
		}
		// Step 2: Service calls to perform CRUD Operation
		public User addNewUser(User user) {
	        dao.beginTransaction();
			dao.addNewUser(user);
			dao.commitTransaction();
			return user;
		}

		@Override
		public User updateUser(User user) {
	        dao.beginTransaction();
			dao.updateUser(user);
			dao.commitTransaction();
			return user;
		}

		@Override
		public User login(User user) {
	        dao.beginTransaction();
			dao.login(user);
			dao.commitTransaction();
			return user;
		}

		@Override
		public boolean logOut() {
	        dao.beginTransaction();
		    dao.logout();
			dao.commitTransaction();
			return false;
		}
		
		
		

}
