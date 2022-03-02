//Enum with constructor , instant variable and method

enum Student
{
	John(11), Bella(10), Sam(13), Viraaj(9);
	private int age;                   //variable defined in enum Student
	int getage() { return age; }  //method defined in enum Student
	private Student(int age)  //constructor defined in enum Student
	{
		this.age= age;
	}
}

public class EnumDemoPG3 {
	public static void main( String args[] )
	{
		Student S;
		System.out.println("Age of Viraaj is " +Student.Viraaj.getage()+ " years");
	}
}
