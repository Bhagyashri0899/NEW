package com.tns.framework;

public abstract class BankAcc 
{
//	Initialized private variables to keep details
	private int accNo;
	private String accNm;
	private float accBal;
	private float currentLimit = 100000;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public float getAccBal() {
		return accBal;
	}
	
	public float getCurrentLimit() {
		return currentLimit;
	}
 
	public void withdraw(float wd) {
		if(wd<=accBal)
		{
			this.accBal=accBal-wd;
			System.out.println(wd + "rs is withdrawn.");
			System.out.println("Your total balance is " + accBal + "\n");
		}else {
			System.out.println("Not having enough balance");
			System.out.println("Your total balance is " + accBal + "\n");
		}
	}
	
	public void withdrew(float wd) {
		if(wd<=accBal)
		{
			System.out.println("\nCurrent limit is: " + currentLimit);
			this.accBal=accBal-wd;
			System.out.println(wd + "rs is withdrawn.");
			System.out.println("Your total balance is " + accBal + "\n");
		}
		else if(wd > accBal && currentLimit>=0)
		{
			if(wd<=currentLimit+accBal)
			{
				System.out.println("\nCurrent limit is: " + currentLimit);
				float diff= wd-accBal;
				currentLimit -= diff; 
				this.accBal=accBal-(wd-diff);
				System.out.println(wd + "rs is withdrawn.");
				System.out.println("Your total balance is " + accBal + "\n");
				System.out.println("Current limit is: " + currentLimit);
			}
			else
			{
				System.out.println("Not enough Balance!!!");
			}
		}
		else 
		{
			System.out.println("You have reached your limits");
		}
	}

	public void deposite(float deposite) {
		this.accBal=accBal+deposite;
		System.out.println(deposite + "rs added succesfully!!");
		System.out.println("Your total balance is " + accBal + "\n");	
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}	
}
