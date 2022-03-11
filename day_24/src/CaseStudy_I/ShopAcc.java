package CaseStudy_I;

public abstract class ShopAcc {
	private int accNo;
	private String acNm;
	private float charges;

	public ShopAcc(int accNo, String acNm, float charges) {
		super();
		this.accNo = accNo;
		this.acNm = acNm;
		this.charges = charges;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getAcNm() {
		return acNm;
	}
	public void setAcNm(String acNm) {
		this.acNm = acNm;
	}
	
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}

	
	public void bookProduct(float  bookProduct ){
		bookProduct( bookProduct);
	}	
	public  void items(float itm)  {
		items(itm);
	  }
		
	 public  String toString() {
		return super.toString();
	}
	
}
 


