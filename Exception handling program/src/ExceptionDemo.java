
public class ExceptionDemo {
	static void canVote(int age){
		if(age<18)
   System.out.println("you are not an adult!");
            		else
		   System.out.println("you can vote!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canVote(20);
		canVote(10);

	}

}
