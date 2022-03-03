package JUnit5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo1 {
	@Test
    void testOnDev()
	{
		System.setProperty("ENV", "DEV");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), AssumptionDemo1::message);
      //remainder of test will be aborted
    }

	@Test
    void testOnProd()
	{
		System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
      //remainder of test will proceed

    }

	private static String message () {
		return "TEST Execution Failed :: ";
	}
}

