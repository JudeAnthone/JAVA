package java_fundamentals;

// polymorphism = many forms, identify as more than one type

public class Main_polymorphism {

	public static void main(String[] args) {
		 
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myAnimal.makeSound();
		myDog.bark();
		myCat.meow();

	}

}
