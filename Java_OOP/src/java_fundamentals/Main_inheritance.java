package java_fundamentals;

public class Main_inheritance {

	public static void main(String[] args) {
		
		  Bicycle bike = new Bicycle();
		  Motor motor = new Motor();
		  
		  System.out.println ("BIKE SPECS");
		  System.out.println("WHEELS: " + bike.wheels);
		  System.out.println("SPEED: " + bike.speed);
		  System.out.println("PASAHERO: " + bike.passenger);
		   
		  System.out.println(" ");
		  
		  System.out.println ("MOTOR SPECS");
		  System.out.println("WHEELS: " + motor.wheels);
		  System.out.println("SPEED: " +   motor.speed);
		  System.out.println("PASAHERO: " + motor.passenger);
		  

	}

}
