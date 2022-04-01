package com.tns.framework;

public interface ShopFactory 
{
	public abstract PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges);

}
