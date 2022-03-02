

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Laptop implements Comparable<Laptop> {
	   String name;
	   int ram;
	   int price;
	   public Laptop(String name, int ram, int price) {
	      super();
	      this.name = name;
	      this.ram = ram;
	      this.price = price;
	   }
	   public String getName() {
	      return name;
	   }
	   public  int getRam() {
	      return ram;
	   }
	   public void setRam(int ram) {
	      this.ram = ram;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public int getPrice() {
	      return price;
	   }
	   public void setPrice(int price) {
	      this.price = price;
	   }
	  
	      
	   
	   public static void main(String[] args) {
	      List<Laptop> laptopList = new ArrayList<>();
	      laptopList.add(new Laptop("HCL", 16, 800));
	      laptopList.add(new Laptop("Apple", 8, 100));
	      laptopList.add(new Laptop("Dell", 4, 600));
	      
	      Collections.sort(laptopList);
	     
	        for (Laptop lap : laptopList) {
	        	System.out.println(lap.getRam());
	        }
		
			
	      }
	   
	public int compareTo(Laptop o) {
		if(this.ram> o.getRam())
			return 1;
		else {
			return -1;
		}
	}
	}


