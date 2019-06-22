package templatePatternTravelBooking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class bookingJUnit {

	
	@Test
	void testTemplatePattern() {
		travelTemplate booking1;
		travelTemplate booking2;
		
		
		booking1 = new trainBooking();
		booking1.travelMode();
		
		assertEquals(true,booking1.travelMode.equals("Train"));
		assertEquals(false,booking1.travelMode.equals("Car"));
		
		
		booking2 = new planeBooking();
		booking2.travelMode();
		
		assertEquals(true,booking2.travelMode.equals("Plane"));
		assertEquals(false,booking2.travelMode.equals("Bus"));
		
	
		
	}

}
