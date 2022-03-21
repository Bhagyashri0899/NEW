package march12;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL = 0;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal );
		
	}

	public static float getMinbal() {
		return MINBAL;
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
