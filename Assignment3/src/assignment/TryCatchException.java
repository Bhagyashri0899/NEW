package assignment;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ar[] = {1,2,3,4,5};
       try {
    	   for (int i = 0; i<= ar.length;i++)
    		   System.out.println(ar[i]+"");
       }
       catch (Exception e) {
    	   System.out.println("\nException caught");
       }
   }

}
