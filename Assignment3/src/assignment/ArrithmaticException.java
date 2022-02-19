package assignment;

public class ArrithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 int x = 100, y = 0; 
			 
			try 
			{ 
			  System.out.println("11"); 
			  int z = x/y; 
			  System.out.println("Result of z: " +z); 
			} 
			catch(ArithmeticException ae) 
			{ 
			  System.out.println("Hello Java"); 
			} 
		
	}

}
