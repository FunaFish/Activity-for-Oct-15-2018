import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		String manufact;
		String model;
		double price;
		String carrier;
		String keepGoing = "y";
		Scanner phoneScan = new Scanner(System.in);
		
		while(keepGoing.equalsIgnoreCase("y")) {
			System.out.println("Enter mobile phone manufacturer: ");
			manufact = phoneScan.nextLine();
			
			System.out.println("Enter the phone's model: ");
			model = phoneScan.nextLine();
			
			System.out.println("Enter price for phone: ");
			price = phoneScan.nextDouble();
			phoneScan.next();
			
			System.out.println("Enter Carrier: ");
			carrier = phoneScan.nextLine();
			
			MobilePhone phone = new MobilePhone(manufact, model, price, carrier);
			
			phone.call("555-555-5555");
			System.out.println(phone.text("This is a text message, im not sure if im supposed to print it?"));
			System.out.println(phone.toString());
			
			System.out.println("Would you like to make another phone? (y/n)");
			keepGoing = phoneScan.nextLine();
			
		}
		

	}

}
