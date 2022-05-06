package weekOne;

public class LoopDetection {
	
	
	public static boolean hasCycle(Node list) {
		
		if(list == null) {
			return false; 
		}
		
		Node node1 = list; 
		Node node2 = list.getNext(); 
		
		while(node1 != node2) {
			
			if(node2 == null ||node2.getNext() == null) {
				return false; 
			}
			
			node1 = node1.getNext(); 
			node2 = node2.getNext().getNext(); 
		}
		
		return true; 
	}

}
