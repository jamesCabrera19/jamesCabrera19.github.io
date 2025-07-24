
public class Fibonacci {

	public static void main(String[] args) {

		
		
		
		
		int end = 7;
		int prev = 0;
//		int res = 0;
		int current = 1;
		
		for(int i = 0; i< end; i++) {
				
			int res = prev + current; // 1
			prev = current;
			
			current = res;
			System.out.println(current);
			
		}
	}

}
