package JUnit5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {

	@Test
	void testOnDev()
	{
		System.setProperty("ENV", "DEV");  // True
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV"))); // True
		// remainder of test will proceed
	}
	@Test
	void testOnProd()
	{
		System.setProperty("ENV", "prod");  // True
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")),AssumptionDemo:: message);// True
		//remainder of test will be aborted
	}
	private static String message () {
		return "Today's TEST Execution Failed ::";
	}
}
