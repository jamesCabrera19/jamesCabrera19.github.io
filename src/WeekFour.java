
//Your Name: 
//Programming Exercise Listing 13.7 Interfaces
//(13.5 Interfaces in textbook page 510) Please following the Demo Video for Concept of Interface in the blackboard week 4, 
// and the Listing 13.7 TestEdible .java program in the textbook page 510 to create the same class 
// and interface, and at the same time, add two of your own classes, such as Fish class and Watermelon Class
//
//You may use IntelliJ IDEA or Eclipse or any IDE to develop your code. Create your project and debug and test run the program correctly. You need to include documentation in the code to get the full points. Submit a screenshot to show the code and running output, as well as your program java file (100 points). 
//
///**
// * Objective: 
// * Algorithm: Description how to resolve the problem.
// *Input and Output:
// * Created by: 
// * Date:
// * Version:
// */
public class WeekFour {

	public static void main(String[] args) {
		Object tiger = new Tiger();
		Object chicken = new Chicken();
		Object apple = new Apple();
		Object watermelon = new Watermelon();
		Object fish = new Fish();


		Object[] objects = new Object[] { tiger, chicken, apple,watermelon, fish };
		
		for(int i = 0; i < objects.length; i++) {
			if(objects[i] instanceof EdibleWeekFour) {
				EdibleWeekFour edible = (EdibleWeekFour) objects[i]; // cast to Edible
				System.out.println(edible.howToEat());
			}
		}
	}

}
class Animal{}

class Fish extends Animal implements EdibleWeekFour{
	public String howToEat() {
		return "Fish: make soup";
	}
}

class Chicken extends Animal implements EdibleWeekFour{
	public String howToEat() {
		return "Chicken: fry it";
	}
}

class Tiger extends Animal{
	
}

abstract class Fruit implements EdibleWeekFour{ 
	// abstract means that it doesn't really need to implement the interface
	
}

class Watermelon extends Fruit{
	public String howToEat() {
		return "Watermelon: make slices";
	}
}
class Apple extends Fruit{
	public String howToEat() {
		return "Apple: make apple juice";
	}
}

class Orange extends Fruit{
	public String howToEat() {
		return "Orange: make orange juice";
	}	
}