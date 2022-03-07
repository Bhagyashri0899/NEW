package day21;

public class Villan implements Actor {

	public void act()
	{
		 System.out.println(" I can Act");
	}
	public void speak()
	{
		 System.out.println(" I can Speak");
	}
	public void rude()
	{
		 System.out.println(" I am rude");
	}
	public static void main(String[] args) {
		
		Villan vln = new Villan();
		vln.act();
		vln.speak();
		vln.rude();
		
	}

}
