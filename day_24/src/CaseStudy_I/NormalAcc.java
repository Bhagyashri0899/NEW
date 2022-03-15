package CaseStudy_I;

public abstract class NormalAcc extends ShopAcc {
	private  final float deliveryCharges = 0;
    
	public NormalAcc(int accNo, String acNm, float charges) {
		super(accNo, acNm, charges);
		
				
	}

	public  float getDeliveryCharges() {
		return deliveryCharges;
	}

	
	public void bookProduct(float bookProduct) {
		super.bookProduct(bookProduct);
	}

	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	


	

}
