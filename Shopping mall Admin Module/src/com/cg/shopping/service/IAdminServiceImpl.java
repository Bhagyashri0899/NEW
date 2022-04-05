package com.cg.shopping.service;


import com.cg.shopping.entities.MallAdmin;
import com.cg.shopping.repository.IMallAdminRepository;
import com.cg.shopping.repository.IMallAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService{

	// Step 1: Establishing connection between Service and Repo
	
	private IMallAdminRepository dao;
	
	public IAdminServiceImpl() 
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
