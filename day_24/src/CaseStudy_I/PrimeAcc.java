package CaseStudy_I;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
    private  float deliveryCharges;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		
	}
	
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public float getDeliverycharges() {
		return deliveryCharges;
	}
	
	public void bookProduct(float bookProduct) {
		 super.bookProduct(bookProduct);
	}

	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + "]";
	}
	
	

}
