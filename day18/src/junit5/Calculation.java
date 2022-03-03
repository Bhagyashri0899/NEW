//created class for test logic OR life cycle method

package junit5;

//Method that returns maximum number 
public class Calculation {

	 public static int findMax(int arr[]){  
		 int max=arr[0];   //arr[0] instead of 0  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
   }
	 
	 //method that returns cube of the given number  
	    public static int cube(int n){  
	        return n*n*n;  
	    }  
	    
	    
	   
	    }  

