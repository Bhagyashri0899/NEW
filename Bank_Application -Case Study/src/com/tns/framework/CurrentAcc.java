package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {
	
	final private float creditLimit=100000;
	
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	
	public void withdrew(float wd) {
		super.withdrew(wd);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
