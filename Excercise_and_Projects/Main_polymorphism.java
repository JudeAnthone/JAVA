// Main class
// demonstrate polymorphism by using the Media class and its subclasses (book and magazine)

package Excercise_and_Projects;

public class Main_polymorphism {

	public static void main(String[] args) {
		
		//creating objects (instantiation) using the Media class. 
		// creating a different types of readings using the Media class. 
		 Media book1 = new Book ("The Comfort Crisis", "Michael Easter", 2020, "Self-Help");
		 Media book2 = new Book ("Kimetsu No Yaiba", "Konohara Hotouge", 2016, "Shonen Manga");
		 
		 
		 Media magazine1 = new Magazine("Avon", "Avon Cosmetics", 2010, "Make-up shits");
		 
		 //displaying informations to console using the polymorphism 
		  book1.displayInfo(); // calls override method in book
		  System.out.println();
		  book2.displayInfo();
		  
		  System.out.println();
		  magazine1.displayInfo();// calls override method in magazine
		  
		  
		  
		 

	}

}
