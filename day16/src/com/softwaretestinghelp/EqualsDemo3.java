//Equals() in string class

package com.softwaretestinghelp;

public class EqualsDemo3 {

	public static void main(String[] args) {
		
		String sampleStr1 = new String("HELLO");
        String sampleStr2 = new String("hello");    
        String sampleStr3 = null;
        String sampleStr4 = "HELLO";
 
         
        System.out.println("sampleStr1 and sampleStr2 are equal : "+(sampleStr1.equals(sampleStr2)));  
        System.out.println("sampleStr1 and sampleStr4 are equal : "+(sampleStr1.equals(sampleStr4)));
        System.out.println("sampleStr2 and sampleStr4 are equal : "+(sampleStr2.equals(sampleStr4)));
        System.out.println("sampleStr4 and sampleStr3 are equal : "+(sampleStr4.equals(sampleStr3)));
         
    }
}


	

