package com.PracticePg.CoreJava;

//Swapping two numbers without using third variable

public class SwappingTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int first = 11, second = 15;

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	        first = first - second;
	        second = first + second;
	        first = second - first;

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	}

}
