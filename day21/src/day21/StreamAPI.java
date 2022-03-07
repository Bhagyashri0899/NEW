package day21;

import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		
     List<Integer>list1 = List.of(2,4,29,40,59);
		
		
    list1.forEach(StreamAPI::doubleIt);

   }
	public static void doubleIt(int i) {
		System.out.println(i*2);
  }
}