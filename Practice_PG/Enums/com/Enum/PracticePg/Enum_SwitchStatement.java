package com.Enum.PracticePg;
//Enums are often used in switch statements to check for corresponding values

enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}


public class Enum_SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level myVar = Level.MEDIUM;

	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	}

}
