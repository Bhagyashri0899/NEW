package CaseStudy_I;

public abstract class GSNormalAcc extends NormalAcc{
	
	public GSNormalAcc (int accNo , String accNm, float charges , float deliveryCharges)
	{
		super(accNo,accNm,charges,deliveryCharges);
	}
	
	public void bookProduct(float bookProduct) {
		super.bookProduct(bookProduct);
	}
	public String toString() {
		return super.toString();
	}	

}
