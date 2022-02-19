package day10;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        
        for(int i=0 ;i<a.length;i++) {
        	
      	  try {
      		  System.out.println("Print array A" + a[i]);
      	  }catch (Exception e){
      		  e.printStackTrace();
      		
      	  }
        }
        System.out.println("I am out of for loop");
	}

}
