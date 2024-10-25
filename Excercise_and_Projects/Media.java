// abstract class - cannot instantiated directly. 

package Excercise_and_Projects;

abstract class Media {
	
	// variables that are stored in here are hidden to the user
	//title, author, year are protected inside the abstract class
	protected String title;
	protected String author; 
	protected int year;
	
	// constructor
	public Media (String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year; 
	}
	
	
	//abstract method to be implemented by subclasses
	public abstract void displayInfo();
	
	//Getter and Setter for the properties
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
	
}
