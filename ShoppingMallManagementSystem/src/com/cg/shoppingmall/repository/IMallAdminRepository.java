package com.cg.shoppingmall.repository;

import com.cg.shoppingmall.entities.MallAdmin;

public interface IMallAdminRepository {
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	public MallAdmin deleteMallAdmin(int id);
	public MallAdmin searchMallAdmin(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	public void updateUser(MallAdmin mallAdmin);
	public void login(MallAdmin mallAdmin);
	public void logout();
	public void approveNewShop(MallAdmin mallAdmin);
}
