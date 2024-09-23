package java_fundamentals;

//used if you want to access privates

public class Main_encapsulation {

	public static void main(String[] args) {
		
		 Car_encap car = new Car_encap("Mitsubishi" , "Xpander");
		  
		 /*basically getting the attributes of the brand and unit 
		 System.out.println( car.getBrand());
		 System.out.println(car.getUnit()); */
		 
		 System.out.println("Original Details: " );
		 car.displayDetails();
		 
		 
		 //use setting of you want to set the new attributes/values
		 car.setBrand("Toyota");
		 //setting the new values for brand and unit
		 car.setUnit("Vios");
		 
		 
		 System.out.println(" ");
		 System.out.println("Updated Details: ");
		  car.displayDetails();
	}

}
