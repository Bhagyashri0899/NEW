package JUnit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo
{
     @Test
     public void simple()
     {
    	 int A = 1;
    	 int B = 1;
    	 assertEquals(A , B);
     }
     @Test
     public void simple1()
     {
    	 int A = 1;
    	 int B = 2;
    	 assertEquals(A , B);
     }
     @Disabled
     @Test
     public void simple2()
     {
    	 int A = 1;
    	 int B = 3;
    	 assertEquals(A , B);
     }
}
