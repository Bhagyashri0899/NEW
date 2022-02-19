package assignment;

public class TryCatchEXC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,d;
	    try
	    {
	      a = 0;
	      b = 10;
	      d = b/a;
	      System.out.println("This line will not be executed");
	    }
	    catch(ArithmeticException e)
	    {
	      System.out.println("Divided by zero");
	    }
	   
	}

}
