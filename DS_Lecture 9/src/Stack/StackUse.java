package Stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException {
		 
		StackUsingArray stack = new StackUsingArray(3);
		  //To Push
         for(int i =1 ; i <= 5 ; i++) {
        	 stack.push(i); // putting elements in stack
         }
         
         //To PoP
         while(! stack.isEmpty()) {
        	 try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				//  Never reach here
			}
         }
	}

}
