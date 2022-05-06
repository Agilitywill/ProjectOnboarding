package weekOne;

public class Intersection {
	

	@SuppressWarnings("null")
	public Node getIntersection(Node headA, Node headB) {
		
		if(headA == null || headB == null) {
			return null; 
		}
		
		Node pointerA = headA; 
		Node pointerB = headB; 
		
		while(pointerA != pointerB) {
			
			if(pointerA != null) {
				pointerA = headB; 
				
			} else {
				pointerA = pointerA.getNext(); 
			}
			
			if(pointerB != null) {
				pointerB = headA; 
				
			} else {
				pointerB = pointerB.getNext(); 
			}
			
		}
		
		return pointerA; 
	}
	
}
