package day14;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		  
        stack.add("Welcome");
        stack.add("Hello");
        stack.add("narrator");
        stack.add("4");
        stack.add("2");
          
        System.out.println("Stack: " + stack);
        
		stack.pop();
		stack.pop();
       
        // Creating an iterator
        Iterator<String> value = stack.iterator();
  
        // Displaying the values       
        System.out.println("The iterator values are: ");
        
        while (value.hasNext())
        {
        	if(value.next().equals("Hello"))
        	
            System.out.println(value.next());
	    }
	}
}
