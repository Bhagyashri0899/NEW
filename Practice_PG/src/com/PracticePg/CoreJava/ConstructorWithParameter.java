package com.PracticePg.CoreJava;

public class ConstructorWithParameter {

	  int Year;
	  String Name;

	  public ConstructorWithParameter(int year, String name) {
	    Year = year;
	    Name = name;
	  }

	  public static void main(String[] args) {
		  ConstructorWithParameter myCar = new ConstructorWithParameter(1969, "Mustang");
	    System.out.println(myCar.Year + " " + myCar.Name);
	  }
}
