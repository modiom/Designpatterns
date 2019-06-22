package templatePatternTravelBooking;

public class carBooking extends travelTemplate {

	@Override
	public void travelMode() {
		// TODO Auto-generated method stub
		this.travelMode = "Car";
		System.out.println("Mode of travel selected is "+ this.travelMode);

	}

}
