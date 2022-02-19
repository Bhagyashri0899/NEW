package assignment;

public class StringIndexOutOfBoundsExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Welcome ." ;
        try {
        	str.charAt(28);
        	System.out.println("String index is valid");
        }catch (StringIndexOutOfBoundsException e)
        {
        	System.out.println("String Index is out of bound");
        }
	}

}
