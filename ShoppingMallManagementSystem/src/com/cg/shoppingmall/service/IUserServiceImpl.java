package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.Employee;
import com.cg.shoppingmall.entities.Item;
import com.cg.shoppingmall.entities.OrderDetails;
import com.cg.shoppingmall.entities.Shop;
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
		public User addUser(User user) {
	        dao.beginTransaction();
			dao.addUser(user);
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
		@Override
		public void addItem(Item item) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public User addUser1(OrderDetails order) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void addUser(OrderDetails order) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void addOrder(User user) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void addEmployee(Employee empl) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void addShop(Shop shop) {
			// TODO Auto-generated method stub
			
		}
		

}
