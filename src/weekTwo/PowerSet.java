package weekTwo;

public class PowerSet {
	
	public static void main(String[] args) {
		
		String set[] = {"a", "b", "c", "d"}; 
		
		printSubsets(set); 
		
	}
	
	public static void printSubsets(String set[]) {
		
		int n = set.length; 
		
		for(int i = 0; i < set.length; i++) {
			
			for(int j = 0; j < n; j++) {
				
				if(i < j && i > 0) {
					
					System.out.println(set[j] + "");
				}
				
			}
			System.out.println("Subset is : " + n);
			
		}
	}

}
