package day13;

import java.util.Stack;

public class JavaCollections {

	public static void main(String[] args) {
		
		Stack<String> oj = new Stack<>();
		oj.push("anu");
		oj.push("tanu");
		oj.push("manu");
		oj.push("ranu");
		oj.push("panu");
		oj.push("micky");
		
		System.out.println(oj);
		oj.pop();
		oj.pop();
		
		System.out.println(oj);
		oj.peek();
		System.out.println(oj);
		
	}

}
