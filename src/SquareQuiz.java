
public class SquareQuiz  {
	public static void main(String[] args) {
		new B();
		
		 try {
			 System.out.println("Welcome to Java");
		      int i = 0;
		      double y = 2.0 / i;
		      System.out.println("Welcome to HTML" );
		    }
		    finally {
		      System.out.println("The finally clause is executed");
		    }
	}
}

class A {
	int i = 7;
	
	public A() {
	    setI(20);
	    System.out.println("i from A is " + i);

	}
	public void setI(int i) {
		this.i = 2 * i;
	}
}

class B extends A{
	public B() {
	    System.out.println("i from B is " + i);
	}
	
	@Override public void setI(int i) {
		this.i = 3*i;
	}
}