package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNo {

	public static void main(String[] args) throws IOException 
		{
			int num , sum=0;
			int t,rem;
			BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" Enter the number:");
			
			num=Integer.parseInt(b.readLine());
			t=num;
			while( num > 0 )
				
			{
			rem= num % 10;
			sum = sum + rem*rem*rem;
			num = num/10;
			}
			
			if( sum == t)
			System.out.println(" The given number is an amstrong number");
			else
			System.out.println("The given number is not an amstrong number");

	}
	}

