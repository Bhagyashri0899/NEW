package day3;

public class OverloadingPolymorphismDemo {

		void addition(int a, int b, int c) {//m1
			System.out.println("Result: "+ (a+b));
		}
		void addition(int a, int b, double c) {//m2
		}
		void addition(int a, int b, int c,int d) {//m3
			System.out.println("Result: "+ (a+b+c+d));
		}
		void addition(int a, int b, int c , int d , int e) {//m4
			System.out.println("Result: "+ (a+b+c+d+e));
		}
		void addition(int a, int b) {//m5
			System.out.println("Result: "+ (a+b));
		}

		public static void main(String[] args) {
			
			OverloadingPolymorphismDemo olpd =new OverloadingPolymorphismDemo();
			olpd.addition(2, 5);//m5
			olpd.addition(2, 5, 5,5,5);//m4
			olpd.addition(2, 5,5,6);//m3
		}
	}


