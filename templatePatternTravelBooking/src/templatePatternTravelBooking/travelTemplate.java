package templatePatternTravelBooking;

public abstract class travelTemplate {
	
	public String user;
	public String pass;
	public String src;
	public String dest;
	public String paymentMode;
	public String travelMode;
	
	public void enterDetails(String user,String pass) {
		this.user = user;
		this.pass = pass;
	}
	public void setSrc(String src) {
		this.src = src;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public abstract void travelMode();
	
	public void payMethod(int choice) {
		
		switch(choice)
		{
		case 1 :
			System.out.println("Booking through Debit/Credit card!");
			System.out.println("Confirming....");
			this.paymentMode = "Debit/Credit card";
			break;
		case 2 :
			System.out.println("Booking through Net Banking!");
			System.out.println("Confirming....");
			this.paymentMode = "Net Banking";
			break;
		case 3:
			System.out.println("Pay at boarding");
			System.out.println("Confirming....");
			this.paymentMode = "Pay at boarding !";
			break;
		default:
			System.out.println("Enter a valid choice");
			break;
		}
		
	}
	
	public final void book(String user,String pass, String src,String dest,int choice) {
		enterDetails(user, pass);
		setSrc(src);
		setDest(dest);
		travelMode();
		payMethod(choice);
		bookingDetails();
		
		
	}
	
	private void bookingDetails() {
		// TODO Auto-generated method stub
		System.out.println("Customer Name " + this.user);
		System.out.println("Boarding place " + this.src);
		System.out.println("Arriving Place " + this.dest);
		System.out.println("Travel mode of Customer " + this.travelMode);
		System.out.println("Payement Method of Customer " + this.paymentMode);
		System.out.println("Thank You for Booking! Have a nice Journey!!");
		
	}
	

}
