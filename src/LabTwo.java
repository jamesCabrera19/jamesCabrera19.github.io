package one;
import java.util.Scanner;


public class LabTwo {

	public static Triangle  getUsrInput() {
		Scanner usrInput = new Scanner(System.in);
		
		int[] sides = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter side " + i+1);
			sides[i] = usrInput.nextInt();
		}
		
		Triangle t = new Triangle(sides[0], sides[1],sides[3]);

		usrInput.close();
		
		return t;
		
		
	}
	public static void main(String[] args) {
		Triangle t = new Triangle(3,5,9);
		
		
		
		System.out.println(t);
	}
}


class GeometricObject{}

class Triangle extends GeometricObject{
	private double side1;
	private double side2; 
	private double side3; 
	
	
	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSideOne() {
		return side1;
	}
	public double getSideTwo() {
		return side2;
	}public double getSideThree() {
		return side3;
	}
	
	public void setSideOne(double side) {
		this.side1 = side;
	}
	public void setSideTwo(double side) {
		this.side2 = side;
	}
	public void setSideThree(double side) {
		this.side3 = side;
	}
	
	public double getArea(double base, double height) {
		return 0.5 * base * height;
	}
	public double getPerimeter(Triangle t) {
		return t.getSideOne() + t.getSideTwo() + t.getSideThree();
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3;
	}
	
}