package templatePatternTravelBooking;

public class trainBooking extends travelTemplate {

	@Override
	public void travelMode() {
		this.travelMode = "Train";
		System.out.println("Mode of travel selected is "+ this.travelMode);


	}

}
