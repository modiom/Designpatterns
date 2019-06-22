package templatePatternTravelBooking;

public class busBooking extends travelTemplate {

	@Override
	public void travelMode() {
		// TODO Auto-generated method stub
		this.travelMode = "Bus";
		System.out.println("Mode of travel selected is "+ this.travelMode);
	}
	

}
