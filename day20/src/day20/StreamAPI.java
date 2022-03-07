package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create list and filter all filter all even numbers from list
		List<Integer>list1 = List.of(2,4,29,40,59);
		
		System.out.println(list1);
		
		//List<Integer> list2 = Arrays.asList(23,12,24,567,677);
		
		Stream<Integer> stream = list1.stream();
		List<Integer>newList = stream.filter(i -> i % 2==0).collect(Collectors.toList());
		System.out.println(newList);
		
	}
}

