package CaseStudy_I;

public abstract class GSPrimeAcc extends PrimeAcc {
	private static  float charges;
	
	public GSPrimeAcc (int accNo , String accNm, float charges ,boolean isPrime)
	{
		super(accNo,accNm,charges,isPrime);
		GSPrimeAcc.charges = charges;
	}
	
	public float getCharges() {
		return charges;
	}
	public void bookProduct(float bookProduct) {
		super.bookProduct(bookProduct);
	}
	public String toString() {
		return super.toString();
	}

	

}
