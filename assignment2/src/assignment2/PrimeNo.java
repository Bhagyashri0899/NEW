package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 BufferedReader Prime=new BufferedReader(new InputStreamReader(System.in)); 
         String CPN; 
         int i,x,Number,m; 
         System.out.print("Check Number to Prime or Not : "); 
         CPN=Prime.readLine(); 
         Number=Integer.parseInt(CPN); 
         x=0; 
         for(i=2;i<=Number-1;i++) 
         { 
                     m=Number%i; 
                     if(m==0) 
                    	 
             { 
                    System.out.println(Number +" Number is not Prime"); 
                    x=1; 
                    break; 
             }          
         } 
         
         if(x==0) 
         { 
                     System.out.println(Number +" Number is a Prime Number"); 
         } 
	}

}
