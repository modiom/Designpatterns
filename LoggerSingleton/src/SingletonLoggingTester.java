import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonLoggingTester {

	

	@Test
	void testInstance() {
		String obj1 = "logger1";
		SingletonLogger logger1 = SingletonLogger.getInstance(obj1);
		assertEquals(true,obj1.equals(logger1.log_name));
		
		String obj2 = "logger2";
		SingletonLogger logger2 = SingletonLogger.getInstance(obj2);
		assertEquals(false,obj2.equals(logger2.log_name)); //checking if the instance is bounded to different logger
		
		assertEquals(true,obj1.contentEquals(logger2.log_name));//checking if both have same contents
	}

}
