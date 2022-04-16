package com.tns.client;

import java.util.Scanner;
import com.tns.application.*;
import com.tns.framework.*;
public class client {
public static void main(String[] args) {
		
		BankFactory bf= new MMBankFactory();
		SavingAcc sa= new MMSavingAcc(0, "Prathamesh", 1000, false);
		CurrentAcc ca= new MMCurrentAcc(0, "Prathamesh", 20000, 0);	
		
//		Execution point
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,an,initdep;
		String name;
		boolean chk1=true, chk2=true, chk3=true;
		
		while(chk1==true)
		{

			System.out.println("Do you have an Account? \n 1.Yes\n 2.No\n 3.Exit");
			a=sc.nextInt();
			
			if(a==1)
			{
				System.out.println("\nEnter your Account Number?");
				an=sc.nextInt();
				while(chk2==true)
				{
					System.out.println("\nEnter type of account \n 1.Saving\n 2.Current\n 3.Exit");
					b=sc.nextInt();
					if(b==1)
					{
						while(chk3==true)
						{
							System.out.println("\nEnter task to perform: \n 1.Deposite \n 2.Withdraw \n 3.Exit");
							c=sc.nextInt();
							if(c==1)
							{
								System.out.println("Your balance is: " + sa.getAccBal());
								System.out.println("Enter amount to deposite: ");
								c=sc.nextInt();
								sa.deposite(c);
							}
							else if(c==2)
							{		
								System.out.println("Your balance is: " + sa.getAccBal());
								System.out.println("Enter amount to withdraw: ");
								c=sc.nextInt();
								sa.withdraw(c);
							}
							else if(c==3)
							{					
								System.out.println("\nApplication closed");
								chk3=false;
							}
							else
							{
								System.out.println("Enter valid input...\n");
							}
						}
						chk2=false;
					}
					else if(b==2)
					{
						while(chk3==true)
						{
							System.out.println("\nEnter task to perform: \n 1.Deposite \n 2.Withdraw \n 3.Exit");
							c=sc.nextInt();
							if(c==1)
							{
								System.out.println("Your current limit: " + ca.getCurrentLimit());
								System.out.println("Your balance is: " + ca.getAccBal());
								System.out.println("\nEnter amount to deposite: ");
								c=sc.nextInt();
								ca.deposite(c);	
							}
							else if(c==2)
							{		
								System.out.println("Your current limit: " + ca.getCurrentLimit());
								System.out.println("Your balance is: " + ca.getAccBal());
								System.out.println("\nEnter amount to withdraw: ");
								c=sc.nextInt();
								ca.withdrew(c);
							}
							else if(c==3)
							{												
								chk3=false;
							}
							else
							{
								System.out.println("Enter valid input...\n");
							}
						}
						chk2=false;
					}
					else if(b==3)
					{
						System.out.println("\nApplication closed");
						chk2=false;
					}
					else
					{
						System.out.println("Enter valid input...\n");
					}
				}
				
				chk1=false;
			}
			else if(a==2)
			{
				System.out.println("\n** Create Account **");
				System.out.println("\nEnter your Name:-");
				name =sc.next();
				System.out.println("\nEnter amount to open account:-");
				initdep =sc.nextInt();
				while(chk2==true)
				{
					System.out.println("Select Account Type: \n 1.Saving \n 2.Current \n 3.Exit");
					b=sc.nextInt();
					if(b==1)
					{
						bf.getNewSavingAcc(1001, name, initdep, true);
						chk2=false;
					}
					else if(b==2)
					{
						bf.getNewCurrentAcc(1001, name, initdep, 100000);
						chk2=false;
					}
					else if(b==3)
					{
						System.out.println("\nApplication closed");
						chk2=false;
					}
					else
					{
						System.out.println("Enter valid input...\n");
					}
				}
				chk1=false;
			}
			else if(a==3)
			{
				System.out.println("\nApplication closed");
				chk1=false;
			}
			else
			{
				System.out.println("Enter valid input...\n");
			}
		}
}
}
