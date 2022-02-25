package day14;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		          
        list.add("ABC");
        list.add("XYZ");
        list.add("30");
        list.add("10");
        list.add("20");
  
        System.out.println("LinkedList:" + list);
          
      
        Iterator<String> Iter = list.iterator();
        System.out.println("The list is as follows:");
        
        while(Iter.hasNext()){
           System.out.println(Iter.next());
	}
	}
}
