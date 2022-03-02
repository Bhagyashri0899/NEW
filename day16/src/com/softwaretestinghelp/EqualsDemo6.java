//Overriding equals() method 

package com.softwaretestinghelp;

public class EqualsDemo6 {

	public static void main(String[] args) {
		
		    EqualsDemoSample eqlDemoSmpl1 = new EqualsDemoSample("Car");
	        EqualsDemoSample eqlDemoSmpl2 = new EqualsDemoSample("Bicycle");
	        EqualsDemoSample eqlDemoSmpl3 = new EqualsDemoSample("Car");
	         
	        System.out.println("eqlDemoSmpl1 and eqlDemoSmpl2 are equal : "
	        +(eqlDemoSmpl1.equals(eqlDemoSmpl2)));  
	        System.out.println("eqlDemoSmpl2 and eqlDemoSmpl3 are equal : "
	        +(eqlDemoSmpl2.equals(eqlDemoSmpl3)));  
	        System.out.println("eqlDemoSmpl1 and eqlDemoSmpl3 are equal : "
	        +(eqlDemoSmpl1.equals(eqlDemoSmpl3)));  

	}

}
