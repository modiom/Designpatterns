package templatePatternTravelBooking;

public class planeBooking extends travelTemplate {

	@Override
	public void travelMode() {
		// TODO Auto-generated method stub
		this.travelMode = "Plane";
		System.out.println("Mode of travel selected is "+ this.travelMode);


	}

}
