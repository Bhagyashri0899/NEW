package day22;

public class ThreadCount extends Thread {
	
	 public void run() {
	      for (int i = 0; i < 7; i++)
	      {
	         System.out.println( Thread.currentThread().getName()+ ":-" + i);
	    	 
	      }
	   }
	 
	public static void main(String[] args) {
		
		ThreadCount t1 = new ThreadCount();
		Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);

        thread1.start();
        thread2.start();  
	        
	    	  
	      }

	}


