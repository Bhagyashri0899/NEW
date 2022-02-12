package day5;

 interface M
 { 
	 void m1();
 }
 
 interface N
 {
	 void m2();
 }
 
 interface P
 {
	 void m3();
 }
 
public class A implements M,N,P
{
	public void m1()
	{
		System.out.println("m1 method");
	
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
	public void m3()
	{
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		
	}
}
