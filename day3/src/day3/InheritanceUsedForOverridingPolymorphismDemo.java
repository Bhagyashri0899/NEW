package day3;

public class InheritanceUsedForOverridingPolymorphismDemo   extends A{
	//child
	int a=2;// declaring+intialization
	int b =3;
	int c;
	
	void sum() {
		c=a+b;
		System.out.println("Result: " + c);
	}
		void multiplication(int a, double b) {//parent
			System.out.println("Parent Result of Multiplication: " +(a*b));
			System.out.println("Hello Child");
		}
		void display() {
			System.out.println("Hello CHild");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceUsedForOverridingPolymorphismDemo iufopd = new InheritanceUsedForOverridingPolymorphismDemo();
		iufopd.sum();
		iufopd.multiplication(3, 2.5);
		A a = new A();
		a.display();
		iufopd.display();
		//iufopd.multiplication(3, 4.0);// declare in class A which is parent class
	}

}

class A{
	void multiplication(int a, double b) {//parent
		System.out.println("Parent Result of Multiplication: " +(a*b));
	}
	void display() {
		System.out.println("Hello Parent");
	}
	
}





