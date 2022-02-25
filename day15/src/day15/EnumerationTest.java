package day15;


import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
        
		 Enumeration<Integer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Integer n = elements.nextElement();
			System.out.println(n);
			//vector.add(100);
		}
		System.out.println(vector);
	}

	
}


