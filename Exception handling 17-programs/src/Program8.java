
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
	            System.out.println(4/0);
	        }
		 //catch(Exception e)
	        //{
	          //  System.out.println("Exception : divide by 0");
	          //}
	     catch(ArithmeticException e)
	        {
	            System.out.println("ArithmeticException :divide by 0");
	        }

	}

}
