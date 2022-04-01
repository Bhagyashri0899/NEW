package com.tns.framework;

public class NormalAcc extends ShopAcc
{

	protected static float deliveryCharge=50;
	
	
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharge = deliveryCharge;
	}
	public void bookProduct(float deliveryCharge)
	{
		System.out.println("Charges are:"+deliveryCharge);
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges="
				+ getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	public float getDeliveryCharge() {
		return deliveryCharge;
	}

}
