package junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
 public class JUnitTest {

	@Test
	void display() {
		System.out.println("Welcome to JUnit5");
		System.out.println("Unit Test Demo");
	}
	
	@Disabled
	@Test
	void display1() {
		System.out.println("Welcome to JUnit5_");
		System.out.println("Unit Test Demo");
  }
 }
