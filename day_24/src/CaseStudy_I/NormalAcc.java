package CaseStudy_I;

public abstract class NormalAcc extends ShopAcc {
	private final float deliveryCharges;
    
	public NormalAcc(int accNo, String acNm, float charges, float deliveryCharges) {
		super(accNo, acNm, charges);
		this.deliveryCharges = deliveryCharges;
				
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	
	public void bookProduct(float bookProduct) {
		super.bookProduct(bookProduct);
	}
	public String toString() {
		return super.toString();
	}	
	


	

}
