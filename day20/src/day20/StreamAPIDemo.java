package day20;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//consumer interface 
class A implements Consumer<Integer>{
	public void accept(Integer i) {}
		
	}

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		/*for(int i= 0;   i<6; i++) {
			System.out.println(values.get(i));		
	    }*/
	
	  /* Iterator<Integer> iValues = values.iterator();
	   while(iValues.hasNext()) {
		   System.out.println(iValues.next());
	   }*/
		
		/*for(int i: values) {
			System.out.println(i);
		}*/
		
		//values.forEach(i-> System.out.println(i));//lambda expression
		
		//Anonymous method
		/*	values.forEach(new Consumer<Integer>() {
				public void accept(Integer i) {
					  System.out.println(i);
				}
			});
			
			Consumer<Integer> c = new A();
			values.forEach(c);
		}*/
		
		
	values.forEach(System.out::println);
	}
}

