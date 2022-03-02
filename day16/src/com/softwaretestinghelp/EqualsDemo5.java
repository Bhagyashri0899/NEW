//equals()  in boolean data type

package com.softwaretestinghelp;

public class EqualsDemo5 {

	public static void main(String[] args) {
		
		    Boolean bln1 = true;
			Boolean bln2 = new Boolean(true);    
	        Boolean bln3 = false;
	         
	        System.out.println("bln1 and bln2 are equal : "+(bln1.equals(bln2)));  
	        System.out.println("bln1 and bln3 are equal : "+(bln1.equals(bln3)));
	        System.out.println("bln2 and bln3 are equal : "+(bln2.equals(bln3)));

	}

}
