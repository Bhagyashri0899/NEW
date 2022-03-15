package march12;

public abstract class SavingAcc extends BankAcc
{
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}
	
	private boolean isSalaried;
    private static final float MINBAL = 0;
	
    public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	
	public static float getMINBAL() {
		return MINBAL;
	}
	@Override
	public void withdraw(float wd ){
		super.withdraw(wd);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	
	
}
