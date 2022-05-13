package weekTwo;

/*
 * Write a recursive function to multiply two positive integers without using the *operator. 
 * You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.
 */

public class RecursiveMultiply {
	
	public static void main(String[] args) {
		
		int x = 5; 
		int y = 5; 
		
		System.out.println(product(x, y));
		
	}

	private static int product(int x, int y) {
		
		if(x < y) {
			
			return product(x, y); 
			
		} else if(y != 0 ) {
			
			return (x + product (x, y - 1)); 
			
		} else {
			
			return 0; 
		}

	}

}
