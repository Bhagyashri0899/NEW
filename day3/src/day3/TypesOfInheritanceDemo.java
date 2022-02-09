package day3;

class Parent1{// parent 
	void sum(int a, int b) {
}
	}
	class Parent2{//child 1 of parent 1

	}
class Parent3 extends Parent2{//child2
	 void sum() {
	}
	}
public class TypesOfInheritanceDemo extends Parent1{//child2 of parent1 
	int a =3;
	int b =7;
	int m;

	void sum() {
		m=a*b;
		System.out.println("Result: " + m);
	}	  
		public static void main(String[] args) {
			TypesOfInheritanceDemo tiod = new TypesOfInheritanceDemo();
  		       tiod.sum();	
		}
	}
