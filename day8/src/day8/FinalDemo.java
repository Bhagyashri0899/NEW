package day8;
class A{
	int a=19;
	final void m1() {
		a=20;
		System.out.println("Print the value a"+a);
	}
	void m2() {
		System.out.println("i am in mathod 2");
	}
	void m2(String s) {
}
}
public class FinalDemo extends A {
   @Override
   void m2(){
	   System.out.println("i am in method m2 of FinalDemo");
   }
	public static void main(String[] args) {
	
		A a = new A();
		a.m1();
		a.m2();

	}

}
