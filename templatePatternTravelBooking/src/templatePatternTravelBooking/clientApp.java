package templatePatternTravelBooking;

import java.util.Scanner;

public class clientApp {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		String pass;
		String src;
		String dest;

		
		travelTemplate booking = null;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		user = in.next();
		System.out.println("Enter Password: ");
		pass = in.next();
		System.out.println("Enter Boarding Place :");
		src = in.next();
		System.out.println("Enter Arriving Place:");
		dest = in.next();
		int choice = 0;
		while(choice<1 || choice >7) {
			System.out.println("Select Mode of Transport: \n1.Bus\n2.Car\n3.Train\n4.Plane");
			choice = in.nextInt();
			}
		switch (choice) {
		case 1:
			booking = new busBooking();
			
			break;
		case 2:
			booking = new carBooking();
			break;
		case 3:
			booking = new trainBooking();
			break;
		case 4:
			booking = new planeBooking();
			break;

		default:
			break;
		}
		
		choice = 0;
		System.out.println("Select Payment Method:\n1.Debit/Credit card\n2.Net Banking\n3.At Boarding");
		choice = in.nextInt();
		booking.book(user, pass, src, dest, choice);

	}

}
