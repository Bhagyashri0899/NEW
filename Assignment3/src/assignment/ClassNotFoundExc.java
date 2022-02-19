package assignment;

public class ClassNotFoundExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{ 
		  Class c = Class.forName("BHAGYASHRI"); 
		  // This method returns the Class object associated with the class or interface with the given string name. 
		} 
		catch(ClassNotFoundException cn) 
		{ 
		  System.out.println(cn.getMessage()); 
		  } 
	}

}
