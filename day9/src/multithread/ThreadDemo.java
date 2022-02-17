package multithread;
 
class A extends Thread{
	public void run() {
	System.out.println("Current ID of A:"+ Thread.currentThread().getId());
	}
}
class B extends Thread{
	public void run() {
	System.out.println("Current ID of B:"+ Thread.currentThread().getId());
	}
}
class C extends Thread{
	public void run() {
	System.out.println("Current ID of C:"+ Thread.currentThread().getId());
	}
}
class D extends Thread{
	public void run() {
	System.out.println("Current ID of D:"+ Thread.currentThread().getId());
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		A a = new A();
		a.start();
		
		B b = new B();
		b.start();
		
		C c = new C();
		c.start();
		
		D d = new D();
		Thread th = new Thread(d);
		th.start();
		System.out.println("ID of main Method:"+ Thread.currentThread().getId());		

	}
}
