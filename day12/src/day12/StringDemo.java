package day12;

public class StringDemo {

	public static void main(String[] args) {
		
		//1st string
		String s = "Hello";
		System.out.println("Print 1st string:"+ s);
		System.out.println("Lenght of 1st string:"+ s.length());

		
		//2nd String
		String s1 = new String("World");
		System.out.println("Print 2nd string:"+ s1);
		s.concat(s1);
		System.out.println("Concat 1st & 2nd String:"+s);
		
		//join 2 string
		String s2 = s.concat(s1);
		System.out.println("Concat 1st & 2nd String:"+s2);
	}

}
