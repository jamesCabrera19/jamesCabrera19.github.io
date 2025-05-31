package one;

public class TestEdible {
	public static void main(String[] args) {
		Object tiger = new Tiger();
		Object chicken = new Chicken();
		Object apple = new Apple();
		Object watermelon = new Watermelon();
		Object fish = new Fish();


		Object[] objects = new Object[] { tiger, chicken, apple,watermelon, fish };
		
		for(int i = 0; i < objects.length; i++) {
			if(objects[i] instanceof Edible) {
                Edible edible = (Edible) objects[i]; // cast to Edible
				System.out.println(edible.howToEat());
			}
		}
	}
}


class Animal{}

class Fish extends Animal implements Edible{
	public String howToEat() {
		return "Fish: make soup";
	}
}

class Chicken extends Animal implements Edible{
	public String howToEat() {
		return "Chicken: fry it";
	}
}

class Tiger extends Animal{
	
}

abstract class Fruit implements Edible{ 
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