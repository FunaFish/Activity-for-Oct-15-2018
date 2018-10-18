
public class MobilePhone {

	private String manufacturer;
	private String model;
	private double price;
	private String carrier;
	
	public MobilePhone(String manufacturer, String model, double price, String carrier) {
		
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
		
	}
	
	public String call(String phoneNumber) {
		return "I am calling " + phoneNumber;
	}
	
	public String text(String textMsg) {
		return textMsg;
	}
	
	public String toString() {
		return "Manufacturer: " + manufacturer + ". Model: " + model + ". Price: $" + price + ". Carrier: " + carrier + ".";
	}
}
