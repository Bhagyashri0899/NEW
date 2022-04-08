package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.MallAdmin;
import com.cg.shoppingmall.repository.IMallAdminRepository;
import com.cg.shoppingmall.repository.IMallAdminRepositoryImpl;

public class IMallAdminServiceImpl implements IMallAdminService{

	// Step 1: Establishing connection between Service and Reno
	
	private IMallAdminRepository dao;
	
	public IMallAdminServiceImpl() 
	{
		dao = new IMallAdminRepositoryImpl();
	}
	
	
	@Override
	public boolean approveNewShop(MallAdmin mallAdmin) {
		dao.beginTransaction();
		dao.approveNewShop(mallAdmin);
		dao.commitTransaction();
		return false;
	}

	@Override
	public MallAdmin updateUser(MallAdmin mallAdmin) {
		dao.beginTransaction();
		dao.updateUser(mallAdmin);
		dao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public MallAdmin login(MallAdmin mallAdmin) {
		dao.beginTransaction();
		dao.login(mallAdmin);
		dao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public boolean logOut() {
		dao.beginTransaction();
		dao.logout();
		dao.commitTransaction();
		return true;
	}

}
