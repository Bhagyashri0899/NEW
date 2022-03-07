package day21;

import java.util.Arrays;

public class findMissingNo {

	public static void main(String[] args) {
		
		 int[] numbers = {1,2,3,4,5,6,8,9,10};
	     
		    int N = 10;
		    int idealSum = (N * (N + 1)) / 2;
		    int sum = Arrays.stream(numbers).sum();
		 
		    int missingNumber = idealSum - sum;
		    System.out.println(missingNumber);

	}

}
