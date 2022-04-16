package com.tns.application;

import com.tns.framework.*;
public class MMBankFactory  extends BankFactory {
	
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		SavingAcc sa= new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		System.out.println("Your Saving Account is created\n");
		return sa;
	}

	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		CurrentAcc ca= new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		System.out.println("Your Current Account is created\n");
		return ca;
	}

}
