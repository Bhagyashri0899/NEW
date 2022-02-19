package assignment;

public class NullPointException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String nullString = null;
	           nullString.endsWith("test");
		 } catch (NullPointerException e) {
            System.out.print("Caught the NullPointerException");
        }
    }
}
	   

