package day21;

public class Hero implements Actor {
     public void act() 
     {
    	 System.out.println(" I can Act");
     }
     public void speak() 
     {
    	 System.out.println(" I can Speak");
     }
     public void comedy() 
     {
    	 System.out.println(" I can comedy");
     }
     public static void main(String[]args) {
    	 Hero  hr = new Hero();
    	 hr.act();
    	 hr.speak();
    	 hr.comedy();
     }
     
}
