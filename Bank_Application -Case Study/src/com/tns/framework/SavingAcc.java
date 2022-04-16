package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	final private float minbal=0;
	
	
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried= isSalaried;
	}

	public void withdraw(float wd) {
		super.withdraw(wd);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", minbal=" + minbal + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
