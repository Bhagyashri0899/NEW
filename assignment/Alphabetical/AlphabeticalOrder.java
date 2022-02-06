import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		String[] names = new String[5];
	      String temp;
	      int i, j;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter 5 Names: ");
	      for(i=0; i<5; i++)
	         names[i] = scan.nextLine();
	      
	      // sorting names in alphabetical order
	      for(i=0; i<5; i++)
	      {
	         for(j=1; j<5; j++)
	         {
	            if(names[j-1].compareTo(names[j])>0)
	            {
	               temp=names[j-1];
	               names[j-1]=names[j];
	               names[j]=temp;
	            }
	         }
	      }
	      
	      System.out.println("\nNames in Alphabetical Order:");
	      for(i=0;i<5;i++)
	         System.out.println(names[i]);
	}

}
