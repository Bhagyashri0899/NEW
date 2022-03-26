package com.PracticePg.CoreJava;

import com.PracticePg.CoreJava.OuterClass1.InnerClass;

class OuterClass1 {
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
	}


public class StaticInnerClass {

	public static void main(String[] args) {
	    InnerClass myInner = new OuterClass1.InnerClass();
	    System.out.println(myInner.y);
	  }
}
