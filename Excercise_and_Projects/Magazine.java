// represents the magazine type of a media. Extending the Media class
package Excercise_and_Projects;

 class Magazine extends Media {
	 private String category;
	 
	 
	 // constructor to initialize the magazine shit
	 public Magazine (String title, String author, int year, String category) {
		 super (title, author, year); // calling the parent class (Media)
		 this.category = category;
	 }
	 
	 
	 //Abstraction method (to display information about the magazine)
	 /* we use override because the title, author, year are in Media class.
	 so we override them */
	 @Override 
	 public void displayInfo() {
		 System.out.println("Magazine Title: " + title);
		 System.out.println("Author: " + author);
		 System.out.println("Publication Year: " + year);
		 System.out.println("Issue Number: " + category);
	 }
	 
	 
	// Getter and setter for the issue property
	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }
	}


