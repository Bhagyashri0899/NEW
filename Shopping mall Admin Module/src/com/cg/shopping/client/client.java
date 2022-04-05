package com.cg.shopping.client;

import com.cg.shopping.entities.MallAdmin;
import com.cg.shopping.service.IAdminService;
import com.cg.shopping.service.IAdminServiceImpl;

public class client 
{
	public static void main(String[] args)
	{
	// CRUD operation calling activity
	
		MallAdmin mallAdmin = new MallAdmin();
		
		IAdminService service = new IAdminServiceImpl();
		
		
		mallAdmin.setId(2);
		mallAdmin.setName("saba");
		mallAdmin.setPassword("bg456");
		mallAdmin.setMall("abc");
		mallAdmin.setPhone("1234567890");
		
		service.approveNewShop(mallAdmin);
		
		
	}
}