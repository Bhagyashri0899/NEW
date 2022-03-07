package day20;

import java.time.LocalDate;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample1 {

	 public static void main(String[] args) {
		    List<String> list = Arrays.asList("A", "B", "C", "D");
		    Stream<String> s = list.stream();

		    Map<String, Integer> map = new HashMap<>();
		    map.put("A", 1);

		    Stream<String> keyStream = map.keySet().stream();
		    Stream<Integer> valStream = map.values().stream();
		    Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

		    Stream<Integer> numbers = Stream.of(1, 2, 3, 4);
		    Stream<String> alphabets = Stream.of("A", "B", "C", "D");

		    Employee[] arrayOfEmps = {
		        new Employee(1, "A", LocalDate.of(1991, 1, 1), 10000d),
		        new Employee(2, "B", LocalDate.of(1992, 1, 1), 20000d),
		        new Employee(3, "C", LocalDate.of(1993, 1, 1), 30000d)
		    };

		    Stream<Employee> employees = Stream.of(arrayOfEmps);

		    Random rand = new Random();

		    Stream<Integer> stream =
		        Stream.generate(() -> rand.nextInt(100)).limit(20);

		    Stream<Integer> infiniteEvenNumbers = Stream.iterate(0, n -> n + 2)
		                                            .limit(10);
		  }
}