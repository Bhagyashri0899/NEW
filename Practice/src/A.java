//Enumeration  if-else

// create enumeration 
enum players 
        {
            sachin, virat, dhoni;
         
        }

public class A {

	public static void main(String[] args) {
		
		 /*
         * stored enumerator in reference variable a1 for 
         * constant dhoni 
         */
        players a1 = players.dhoni;
         
        /*
         *  Started if statement with OR condition.
         *  If any of these conditions are met then it will
         *  print the statement specified inside if statement
         */
         
        if(a1 == players.virat || a1 == players.sachin) {
            System.out.println("Sachin and Virat are greatest batsmen");
        }
         
        /*
         * if none of the above condition is met then it will
         * print the below specified statement
         */
         
        else {
            System.out.println("Dhoni is the best Captain");
        }
	}

}
