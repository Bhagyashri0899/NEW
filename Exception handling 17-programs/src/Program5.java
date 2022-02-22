
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try
	       {
	             System.out.println(4/0);
		 //will not get printed
	             System.out.println("end of try!");
	        }
	catch(ArithmeticException e)
	        {
	            System.out.println("divide by 0");
	        }

	}

}
