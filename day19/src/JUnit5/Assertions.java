package JUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;


public class Assertions {

	//Assert Equals
	   @Test
	    void test () {
	        float a=(float) 1.2;
	        float b=(float) 3.2;
	        float delta=(float) 2.1;
	        assertEquals(a, b ,delta); //(float expected, float actual , float delta)
	        }    
	 
	   //assertFalse()
	   @Test
	    void test1() {
	        int a=5;
	        boolean flag;
	        if(a<2) {
	            flag=true;
	         }
	         else {
	            flag=false;
	         }
	         assertFalse (flag);
	       }
	   
	   //assertNull()
	   @Test
	    void test2() {
	        String myStr=null; 
	        Supplier<String> strSupplier = () -> new String ("The object is null hence assert is failed");  
	        String myAssertMsg = strSupplier.get (); 
	        assertNull (myStr, myAssertMsg);
	 	    }
	   
	   //assertNotNull
	   @Test
	    void test3() {
	       Object dog = new Object();

	       assertNotNull(dog, () -> "The dog should not be null");
	      }
	   
	   //assertArrayEquals()
	   @Test
	    void test4() {
	       char[] expected = { 'J', 'u', 'p', 'i', 't', 'e', 'r' };
	       char[] actual = "Jupiter".toCharArray();

	       assertArrayEquals(expected, actual, "Arrays should be equal");
	      }
	   
	   //assertIterableEquals()
	   @Test
	    void verifyIterablesValueMatch () {
	        Iterable<String> expectedList = new LinkedList<>(Arrays.asList("First", "Second", "Third"));
	        Iterable<String> actualList = new ArrayList<> (Arrays.asList("First", "Second", "Third"));
	        assertIterableEquals(expectedList, actualList);
	       }
	   
	   //assertLineMatch()
	   @Test
	      void verifyLinesMatch () { 
	        List<String> expected = Arrays.asList(".*",".*", "house"); 
	          
	         List<String> actual = Arrays.asList("This is a ", "beautiful", "house");
	         assertLinesMatch(expected, actual); 
	        }
	   
	   //assertTrue()
	   @Test
	    void verifyConditionTrue() {
	       assertTrue(5 > 4, "5 is greater the 4");
	       assertTrue(null == null, "null is equal to null");
	      }
	   
	   //assertSame()
	   @Test
	    void test5() {
	       String language = "Java";
	       Optional<String> optional = Optional.of(language);

	       assertSame(language, optional.get());
	      }
	   
	   //assertAll()
	   @Test
	   void test6() {
	       assertAll(
			      "heading",
			      () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
			      () -> assertEquals("java", "JAVA".toLowerCase())
			      );
			  }
	   
	  //assertThrows()
	   @Test
	    void test7() {
		    Exception exception = assertThrows(NumberFormatException.class, () -> {
		        Integer.parseInt("1a");
		    });

		    String expectedMessage = "For input string";
		    String actualMessage = exception.getMessage();

		    assertTrue(actualMessage.contains(expectedMessage));
		  }
	   
   }

