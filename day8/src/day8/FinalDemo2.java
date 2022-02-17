package day8;
   
class FinalDemo2 {
      //create a final method
	public final void display() {
		System.out.println("This is a final method.");
	}
	}
    
class Main extends FinalDemo2{
	//try to override final method
	// public final void display() {
		 //   System.out.println("The final method is overridden.");
		 // }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Main obj = new Main();
        obj.display();
        
	}

}
