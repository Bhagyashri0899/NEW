package march12;

public abstract class CurrentAcc extends BankAcc{
  private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal , float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
		
		
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	
	@Override
	public void withdraw(float wd ){
		super.withdraw(wd);
	}
	@Override
	public String toString()
	{
		return super.toString();
	}
}
