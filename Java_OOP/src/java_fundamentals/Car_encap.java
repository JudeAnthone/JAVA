package java_fundamentals;

public class Car_encap {
	
	private String brand;
	private String unit;
	
	
	//constructor
	Car_encap(String brand, String unit){
		this.brand = brand;
		this.unit = unit;
	}
	
	//Getter for brand
	public String getBrand() {
		return brand;
	}

	//Getter for unit
	public String getUnit() {
		return unit;
	}
	
	//setter for brand (we use void because we are not returning
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Unit: " + unit);
	}
}
