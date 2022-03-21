package march12;

import java.util.Scanner;

public class bankAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number");
		int accNo = sc.nextInt();
		System.out.println("Enter account holder name");
		String accNm = sc.next();
		System.out.println("Enter account Balance");
		float accBal = sc.nextFloat();
		System.out.println("Is Salaried? ");
		boolean isSalaried = sc.nextBoolean();

		BankFactory bf = new MMBankFactory();
		while (true) {
			System.out.println("Press 1 ----Savings Account");
			System.out.println("Press 2 ----Current Account");
			System.out.println("Any other number --- stop");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				bf.getNewSavingAcc(accNo, accNm, accBal, isSalaried);
				SavingAcc sa = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
				System.out.println("Enter amount to withdraw from saving account");
				sa.withdraw(sc.nextFloat());
				String s = sa.toString();
				System.out.println(s);

				System.exit(0);

			case 2:
				System.out.println("Enter the amount credit");
				float credit = sc.nextFloat();
				bf.getNewCurrentAcc(accNo, accNm, accBal, credit);
				CurrentAcc ca = new MMCurrentAcc(accNo, accNm, accBal, credit);
				System.out.println("Enter amount to withdraw from current account");
				ca.withdraw(sc.nextFloat());
				String c = ca.toString();
				System.out.println(c);
				System.exit(0);

			default:
				System.out.println("INVALID ACCOUNT ");
				System.exit(0);
			}
		}
	}

}
