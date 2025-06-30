
// **
// * Objective: more practice with class
// * Algorithm: method casting
// * Input and Output: objects, returns methods. 
// * Created by: Jaime Cabrera
// * Date: June 24, 2025
// * Version: 1.0
// */

public class WeekFour {

	public static void main(String[] args) {
		// creating different Objects. these objects implement method called howToEat()
		Object tiger = new Tiger();
		Object chicken = new Chicken();
		Object fish = new Fish();
		// more objects
		Object apple = new Apple();
		Object watermelon = new Watermelon();


		// array of objects.
		Object[] objects = new Object[] { tiger, chicken, apple,watermelon, fish };
		
		// loop to call the objects method - howToEat()
		for(int i = 0; i < objects.length; i++) {
			
			// checking if Object has the method howToEat()
			if(objects[i] instanceof EdibleWeekFour) {
				// empty space for readability
				System.out.println();
				// casting the method to call it
				EdibleWeekFour edible = (EdibleWeekFour) objects[i]; // casting to call the methods

				// calling the method
				System.out.println(edible.howToEat());
				
			}else if(objects[i] instanceof MeatEater) {
				
				// casting the method 
				MeatEater carnivore = (MeatEater) objects[i];
				
				// calling the method
				System.out.println(carnivore.eatChicken());
			}
		}
		return;

	}
}

// Animal class
class Animal{}

// creating a Fish object
class Fish extends Animal implements EdibleWeekFour{
	// simple method that describes how to eat the object - returns a string
	public String howToEat() {
		return "Fish: make soup";
	}
}

// creating Chicken object
class Chicken extends Animal implements EdibleWeekFour{
	// simple method that describes how to eat the object - returns a string
	public String howToEat() {
		return "Chicken: fry it";
	}
}
// creating a Tiger object - tiger does not implements Edible Interface
class Tiger extends Animal implements MeatEater{
	// method that returns a string
	public String eatChicken() {
		return "Tiger: Eats chicken";
	}
}


// creating an abstract Fruit object that doesnt need to implement the interface
abstract class Fruit implements EdibleWeekFour{ 
	// abstract means that it doesn't really need to implement the interface
	
}

// creating a fruit Object
class Watermelon extends Fruit{
	// simple method that describes how to eat the object - returns a string
	public String howToEat() {
		return "Watermelon: make slices";
	}
}

//creating a fruit Object
class Apple extends Fruit{
	// simple method that describes how to eat the object - returns a string
	public String howToEat() {
		return "Apple: make apple juice";
	}
}
//creating a fruit Object
class Orange extends Fruit{
	// simple method that describes how to eat the object - returns a string
	public String howToEat() {
		return "Orange: make orange juice";
	}	
}