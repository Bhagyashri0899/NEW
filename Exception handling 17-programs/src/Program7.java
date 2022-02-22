
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
	            System.out.println(4/0);
	           }
	      
	        //superclass of ArithmeticException 
	        catch(Exception e){
	            System.out.println("divide by 0");
	        }

	}

}
