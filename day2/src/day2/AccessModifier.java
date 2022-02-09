package day2;

public class AccessModifier {
		int nos;
		float hrs;
		int noc;
		void displayStudents() {//m1
			System.out.println("Number of Students");
		}
		void displayHours() {//m2
			System.out.println("Number of Hours");
		}
		void displayClass() {//m3
			System.out.println("Number of Class");
		}


		public static void main(String[] args) {
			
			AccessModifier am = new AccessModifier();
			am.displayStudents();
		}
}

	



	


