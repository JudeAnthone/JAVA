package java_basics;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		 
		String x;
		Scanner s = new Scanner (System.in);

		System.out.println("enter name: ");
		x = s.nextLine();
		
		System.out.println("you are: " + x);
		
		
	}

}
