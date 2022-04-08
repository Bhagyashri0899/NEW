package com.cg.shoppingmall.repository;

import com.cg.shoppingmall.entities.Mall;

public interface IMallRepository 
{
	
		public Mall addMall(Mall mall);
		public Mall updateMall(Mall mall);
		public Mall searchMall(int id);

		public abstract void beginTransaction();
		public abstract void commitTransaction();
}
