package day11;

public class ThrowDemo {
     void validate(int income) {
    	 if(income > 5)
     {
    	 System.out.println("Not Eligible");
      }
     else
     {
    	 System.out.println("Eligible");
     }
     }
	public static void main(String[] args) {
         ThrowDemo td = new ThrowDemo();
         td.validate(10);
	}

}
