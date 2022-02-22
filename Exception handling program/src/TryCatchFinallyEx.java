
class TryCatchFinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		try
		{
		int i = arr[4];
		// this statement will never execute
		// as exception is raised by above statement
		System.out.println("Inside try block");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
		System.out.println("Exception caught in catch block");
	}
	finally // always executed
	{
	System.out.println("finally block executed");
	}
	// rest program will be executed
	System.out.println("Outside try-catch-finally clause");
		
	}
}
