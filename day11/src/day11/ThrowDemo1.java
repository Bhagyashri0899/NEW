package day11;

public class ThrowDemo1 {
	 void validate(int income) {
    	try
    	{
    		if(income > 5)
    	
            {
    	       throw new ArithmeticException("Not Wligible");
            }
             else
            {
    	     System.out.println("Eligible");
             }
       }
    	catch(Exception e)
    	{
    		System.out.println("Sorry");
    	}
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ThrowDemo td = new ThrowDemo();
           td.validate(10);
           System.out.println("Welcome");
	}

}
