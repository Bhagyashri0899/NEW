package CaseStudy_I;

public abstract class GSNormalAcc extends NormalAcc{
	
	public GSNormalAcc (int accNo , String accNm, float charges )
	{
		super(accNo,accNm,charges);
	}
	
	public void bookProduct(float bookProduct) {
		super.bookProduct(bookProduct);
	}
	public String toString() {
		return super.toString();
	}	

}
