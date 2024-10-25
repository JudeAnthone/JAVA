// represents a book which we put values on the Media. Extends the Media class
package Excercise_and_Projects;

  class Book extends Media {
	  private String genre;
	  
	  // constructor to initialize the book properties
	  public Book (String title, String author, int year, String genre) {
		  super(title, author, year); // parent class (Media) constructor
		  this.genre = genre;
	  }
	  
	  //abstract method from the Media (abstraction is the Media class) 
	  @Override
	  public void displayInfo() {
		  System.out.println("Book Title: " + title);
		  System.out.println("Author: " + author);
		  System.out.println("Publication year: " + year);
		  System.out.println("Genre: " + genre);
	  }
	  
	  public String getGenre() {
		  return genre;
	  }
	  
	  public void setGenre(String genre) {
		  this.genre = genre;
	  }
	  
	  

}
