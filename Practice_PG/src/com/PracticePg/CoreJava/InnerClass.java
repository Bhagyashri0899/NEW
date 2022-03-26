package com.PracticePg.CoreJava;

class OuterClass {
	  int x = 37;

	  class InnerClass {
	    int y = 9;
	  }
	}

public class InnerClass
{
	public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    
	    System.out.println(myInner.y + myOuter.x);
	  }
}
