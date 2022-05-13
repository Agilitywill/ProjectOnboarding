
package weekTwo;

/*
 * Magic Index: A magic index in an array A [ 0 ... n -1]
 * is defined to be an index such that A[i] = i.
 * Given a sorted array of distinct integers,
 * write a method to find a magic index, if one exists, in array A.
 */

public class MagicIndex {
	
	public static void main(String[] args) {
		
		int[] array = {-12, -43, -65, -2, 0, 32, 98, 43, 54, 43};
		
		System.out.println("Magic index is: " + findMagicIndex(array));
		
	}
	
	public static int findMagicIndex(int[] array) {
		
		int left = 0; 
		int right = array.length - 1; 
		int middle = (left + right) / 2; 
		
		if(left == 0 && right == 0) {
			return 0; 
		}
		
		if(left < right) {
			if(middle == array[middle]) {
				return middle; 
				
			}
			if(middle > array[middle]) {
				return findMagicIndex(array); 
			}
		}
		return middle;
		
	}

}
