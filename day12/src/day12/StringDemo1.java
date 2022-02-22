package day12;

public class StringDemo1 {

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
		
		
		//3rd String
		String s3 = "Hello";
		System.out.println("Print 1st string:"+ s3);
		
		//4th String
		String s4 = "Hello";
		System.out.println("Print 1st string:"+ s4);
		if(s==s3)
		{
			System.out.println("Print S = s3");			
		}
		else
		{
			System.out.println("Print S = !s");
		}
	}

}
