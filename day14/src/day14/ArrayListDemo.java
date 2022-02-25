package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		 ArrayList<String> cars = new ArrayList<>();

     cars.add("Volvo");
     cars.add("BMW");
     cars.add("Ford");
     cars.add("Mazda");

     Collections.sort(cars);
     
     System.out.println(cars);                 

     cars.remove(2);
     System.out.println(cars); 
     
     Iterator<String> iter =  cars.iterator();
     
     System.out.println("The iterator values"+ " of list are: ");
    
                       
     while (iter.hasNext()) {
    	
         System.out.print(iter.next()+ " " );
	}
	}
}

