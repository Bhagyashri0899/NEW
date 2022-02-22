
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
	            System.out.println(4/0);
	           }
	      
	        //ArithmeticException 
	        catch(ArithmeticException e){
	            System.out.println("divide by 0");
	        }

	}

}
