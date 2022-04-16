package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	final private float minbal=0;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}
	
	public void withdraw(float wd) {
		super.withdraw(wd);
	}

@Override
public String toString() {
	return "MMSavingAcc [minbal=" + minbal + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}
}
