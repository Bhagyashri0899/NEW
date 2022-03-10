package day_23;
//private method can not be override

class A{
	//private void printName() {
	public void printName() {
		System.out.println("Value-A");
	}
}

class B extends A{
	//public void printName() {
	public void printName() {
		System.out.println("Name-B");
	}
}
public class Practice_PG {

	public static void main(String[] args) {
		
		//B b = new B();
		//b.printName();
		A a = new A();
		a.printName();
	}

}
