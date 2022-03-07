package day20;

import java.util.Comparator;
import java.util.stream.Stream;

public class sortStream {
	public static void main(String[] args)
    {
		Stream<Integer> numStream = Stream.of(1,3,5,4,2);

		//numStream.sorted().forEach(System.out::println);//ascending
				
		numStream.sorted( Comparator.reverseOrder() ).forEach(System.out::println); //descending
   }
 }

