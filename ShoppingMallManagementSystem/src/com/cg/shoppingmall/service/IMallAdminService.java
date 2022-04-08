package com.cg.shoppingmall.service;

import com.cg.shoppingmall.entities.MallAdmin;

public interface IMallAdminService {
	 public boolean approveNewShop(MallAdmin mallAdmin);
		public MallAdmin updateUser(MallAdmin mallAdmin);
		public MallAdmin login(MallAdmin mallAdmin);
		public boolean logOut();
}
