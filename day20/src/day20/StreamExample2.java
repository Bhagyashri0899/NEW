package day20;

//create fresh stream everytime 
//we can not reuse the stream

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample2 {
	 public static void main(String[] args) 
	  {
	    List<Integer> tokens = Arrays.asList(1, 2, 3, 4, 5);
	     
	    //first use
	    Optional<Integer> result = tokens.stream().max(Integer::compareTo);
	    System.out.println(result.get());
	     
	    //second use
	    result = tokens.stream().min(Integer::compareTo);
	    System.out.println(result.get());
	     
	    //third use
	    long count = tokens.stream().count();
	    System.out.println(count);
	  }
}
